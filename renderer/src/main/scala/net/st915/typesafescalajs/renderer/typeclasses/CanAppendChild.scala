package net.st915.typesafescalajs.renderer.typeclasses

import org.scalajs.dom.HTMLElement

object CanAppendChild {

  def apply[F[_]](using ev: CanAppendChild[F]): CanAppendChild[F] = ev

}

trait CanAppendChild[F[_]] {

  def appendChild[A <: HTMLElement, B <: HTMLElement](child: A)(parent: B): F[Unit]

}
