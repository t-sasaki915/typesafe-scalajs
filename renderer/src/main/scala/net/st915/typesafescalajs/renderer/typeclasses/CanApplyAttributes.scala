package net.st915.typesafescalajs.renderer.typeclasses

import cats.data.Kleisli
import org.scalajs.dom.HTMLElement

object CanApplyAttributes {

  def apply[F[_]](using ev: CanApplyAttributes[F]): CanApplyAttributes[F] = ev

}

trait CanApplyAttributes[F[_]] {

  def applyAttributes[A <: HTMLElement, B, C](attributes: Set[(B, C)]): Kleisli[F, A, A]

}
