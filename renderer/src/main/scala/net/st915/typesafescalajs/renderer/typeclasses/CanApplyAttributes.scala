package net.st915.typesafescalajs.renderer.typeclasses

import cats.data.Kleisli
import cats.effect.unsafe.IORuntime
import org.scalajs.dom.HTMLElement

object CanApplyAttributes {

  def apply[F[_]](using CanApplyAttributes[F]): CanApplyAttributes[F] = summon

}

trait CanApplyAttributes[F[_]] {

  def applyAttributes[A <: HTMLElement, B, C](attributes: Set[(B, C)])(using
  IORuntime): Kleisli[F, A, A]

}
