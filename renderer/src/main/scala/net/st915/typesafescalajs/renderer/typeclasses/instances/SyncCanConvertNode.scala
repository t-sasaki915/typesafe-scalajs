package net.st915.typesafescalajs.renderer.typeclasses.instances

import cats.data.Kleisli
import cats.effect.Sync
import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.TextNode
import net.st915.typesafescalajs.dom.tags.*
import net.st915.typesafescalajs.renderer.Environment
import net.st915.typesafescalajs.renderer.domain.typealiases.NativeNode
import net.st915.typesafescalajs.renderer.typeclasses.*
import org.scalajs.dom.HTMLElement

class SyncCanConvertNode[
  F[_]: Sync: CanApplyAttributes: CanCreateNativeTextNode: CanCreateNativeElement: CanAppendChild
] extends CanConvertNode[F] {

  import cats.syntax.all.*

  private def asNativeNode[A <: NativeNode]: Kleisli[F, A, NativeNode] =
    Kleisli { node => Sync[F].pure(node.asInstanceOf[NativeNode]) }

  private def applyChilds[A <: HTMLElement](childs: List[Node])(using
  Environment): Kleisli[F, A, A] =
    Kleisli { nativeNode =>
      childs
        .map(convertNode.run)
        .foldLeftM(nativeNode) { (acc, child) => child >>= CanAppendChild[F].appendChild(acc).run }
    }

  override def convertNode(using Environment): Kleisli[F, Node, NativeNode] =
    Kleisli { node =>
      node match
        case TextNode(content) =>
          CanCreateNativeTextNode[F].createNativeTextNode andThen
            asNativeNode run content
        case original: Tag[_] =>
          CanCreateNativeElement[F].createNativeElement andThen
            CanApplyAttributes[F].applyAttributes(original.attributes) andThen
            applyChilds(original.childs) andThen
            asNativeNode run original
    }

}
