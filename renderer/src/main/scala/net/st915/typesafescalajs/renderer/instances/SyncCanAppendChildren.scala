package net.st915.typesafescalajs.renderer.instances

import cats.data.Kleisli
import cats.effect.Sync
import net.st915.typesafescalajs.renderer.domain.typealiases.NativeNode
import net.st915.typesafescalajs.renderer.typeclasses.*

final class SyncCanAppendChildren[F[_]: Sync: CanAppendChild] extends CanAppendChildren[F] {

  import cats.syntax.all.*

  override def appendChildren[A <: NativeNode, B <: NativeNode](parent: A): Kleisli[F, List[B], A] =
    Kleisli { children =>
      children.foldLeftM(parent) { (acc, child) => CanAppendChild[F].appendChild(acc) run child }
    }

}
