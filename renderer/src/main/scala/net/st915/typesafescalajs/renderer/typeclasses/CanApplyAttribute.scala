package net.st915.typesafescalajs.renderer.typeclasses

import org.scalajs.dom.HTMLElement

object CanApplyAttribute {

  def apply[F[_]](using ev: CanApplyAttribute[F]): CanApplyAttribute[F] = ev

}

trait CanApplyAttribute[F[_]] {

  def applyAttribute[A <: HTMLElement, B](element: A)(attribute: (_, B)): F[Unit]

}
