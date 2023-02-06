package net.st915.typesafescalajs.renderer.instances

import cats.data.Kleisli
import cats.effect.Sync
import cats.effect.unsafe.IORuntime
import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.TextNode
import net.st915.typesafescalajs.dom.tags.*
import net.st915.typesafescalajs.renderer.Environment
import net.st915.typesafescalajs.renderer.domain.typealiases.NativeNode
import net.st915.typesafescalajs.renderer.typeclasses.*
import org.scalajs.dom.HTMLElement

final class SyncCanConvertNode[
  F[_]: Sync: CanApplyAttributes: CanCreateNativeTextNode: CanCreateNativeElement: CanAppendChild
] extends CanConvertNode[F] {

  import cats.syntax.all.*

  private def asNativeNode[A <: NativeNode]: Kleisli[F, A, NativeNode] =
    Kleisli { node => Sync[F].pure(node.asInstanceOf[NativeNode]) }

  private def applyChildren[A <: HTMLElement](children: List[Node])(
    using Environment,
    IORuntime
  ): Kleisli[F, A, A] =
    Kleisli { nativeNode =>
      children
        .map(convertNode.run)
        .foldLeftM(nativeNode) { (acc, child) => child >>= CanAppendChild[F].appendChild(acc).run }
    }

  override def convertNode(using Environment, IORuntime): Kleisli[F, Node, NativeNode] =
    Kleisli { node =>
      node match
        case TextNode(content) =>
          CanCreateNativeTextNode[F].createNativeTextNode andThen
            asNativeNode run content
        case original: Tag[_] =>
          CanCreateNativeElement[F].createNativeElement andThen
            CanApplyAttributes[F].applyAttributes(original.attributes) andThen
            applyChildren(original.children) andThen
            asNativeNode run original
    }

}
