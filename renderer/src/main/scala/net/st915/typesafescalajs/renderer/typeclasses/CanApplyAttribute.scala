package net.st915.typesafescalajs.renderer.typeclasses

import cats.data.Kleisli
import org.scalajs.dom.HTMLElement

object CanApplyAttribute {

  def apply[F[_]](using ev: CanApplyAttribute[F]): CanApplyAttribute[F] = ev

}

trait CanApplyAttribute[F[_]] {

  def applyAttribute[A <: HTMLElement, B, C](attribute: (B, C)): Kleisli[F, A, A]

}
