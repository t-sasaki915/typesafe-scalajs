package net.st915.typesafescalajs.renderer.typeclasses

import cats.data.Kleisli
import net.st915.typesafescalajs.renderer.domain.typealiases.NativeNode

object CanAppendChildren {

  def apply[F[_]](using ev: CanAppendChildren[F]): CanAppendChildren[F] = ev

}

trait CanAppendChildren[F[_]] {

  def appendChildren[A <: NativeNode, B <: NativeNode](parent: A): Kleisli[F, List[B], A]

}
