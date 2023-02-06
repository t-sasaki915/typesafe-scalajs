package net.st915.typesafescalajs.renderer.typeclasses

import cats.data.Kleisli
import net.st915.typesafescalajs.renderer.domain.typealiases.NativeNode

object CanAppendChildren {

  def apply[F[_]](using CanAppendChildren[F]): CanAppendChildren[F] = summon

}

trait CanAppendChildren[F[_]] {

  def appendChildren[A <: NativeNode, B <: NativeNode](parent: A): Kleisli[F, List[B], A]

}
