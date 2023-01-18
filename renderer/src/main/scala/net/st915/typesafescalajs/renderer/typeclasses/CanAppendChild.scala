package net.st915.typesafescalajs.renderer.typeclasses

import cats.data.Kleisli
import net.st915.typesafescalajs.renderer.domain.typealiases.NativeNode

object CanAppendChild {

  def apply[F[_]](using ev: CanAppendChild[F]): CanAppendChild[F] = ev

}

trait CanAppendChild[F[_]] {

  def appendChild[A <: NativeNode, B <: NativeNode](parent: A): Kleisli[F, B, A]

}
