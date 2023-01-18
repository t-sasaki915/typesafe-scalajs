package net.st915.typesafescalajs.renderer.typeclasses

import cats.data.Kleisli
import net.st915.typesafescalajs.renderer.domain.typealiases.NativeNode

object CanAppendChilds {

  def apply[F[_]](using ev: CanAppendChilds[F]): CanAppendChilds[F] = ev

}

trait CanAppendChilds[F[_]] {

  def appendChilds[A <: NativeNode, B <: NativeNode](parent: A): Kleisli[F, List[B], A]

}
