package net.st915.typesafescalajs.renderer.typeclasses

import org.scalajs.dom.HTMLElement

object CanApplyAttributes {

  def apply[F[_]](using ev: CanApplyAttributes[F]): CanApplyAttributes[F] = ev

}

trait CanApplyAttributes[F[_]] {

  def applyAttributes[A <: HTMLElement, B, C](element: A)(attributes: Set[(B, C)]): F[Unit]

}
