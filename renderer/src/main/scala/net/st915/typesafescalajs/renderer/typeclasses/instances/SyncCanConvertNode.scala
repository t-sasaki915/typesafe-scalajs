package net.st915.typesafescalajs.renderer.typeclasses.instances

import cats.effect.Sync
import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.TextNode
import net.st915.typesafescalajs.dom.tags.*
import net.st915.typesafescalajs.renderer.Environment
import net.st915.typesafescalajs.renderer.domain.typealiases.NativeNode
import net.st915.typesafescalajs.renderer.typeclasses.*

class SyncCanConvertNode[
  F[_]: Sync: CanApplyAttributes: CanCreateNativeTextNode: CanCreateNativeElement: CanAppendChild
] extends CanConvertNode[F] {

  import cats.syntax.all.*

  private def asNativeNode[A <: NativeNode](node: A): F[NativeNode] =
    Sync[F].pure(node.asInstanceOf[NativeNode])

  override def convertNode(node: Node)(using Environment): F[NativeNode] =
    node match
      case TextNode(content) =>
        CanCreateNativeTextNode[F].createNativeTextNode(content) >>=
          asNativeNode
      case original: Tag[_] =>
        for {
          nativeElem <- CanCreateNativeElement[F].createNativeElement(original)
          _ <- original
            .childs
            .map(convertNode)
            .map(_ >>= CanAppendChild[F].appendChild(nativeElem))
            .sequence
          _ <- CanApplyAttributes[F].applyAttributes(nativeElem)(original.attributes)
          nativeNode <- asNativeNode(nativeElem)
        } yield nativeNode

}
