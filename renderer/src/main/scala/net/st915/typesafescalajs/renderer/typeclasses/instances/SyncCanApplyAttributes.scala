package net.st915.typesafescalajs.renderer.typeclasses.instances

import cats.effect.Sync
import net.st915.typesafescalajs.renderer.typeclasses.*
import org.scalajs.dom.HTMLElement

class SyncCanApplyAttributes[F[_]: Sync: CanApplyAttribute] extends CanApplyAttributes[F] {

  import cats.syntax.all.*

  override def applyAttributes[A <: HTMLElement, B, C](element: A)(attributes: Set[(B, C)])
    : F[Unit] =
    attributes
      .toList
      .map(CanApplyAttribute[F].applyAttribute(element))
      .sequence >> Sync[F].unit

}
