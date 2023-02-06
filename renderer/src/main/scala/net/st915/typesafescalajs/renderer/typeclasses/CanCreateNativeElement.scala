package net.st915.typesafescalajs.renderer.typeclasses

import cats.data.Kleisli
import net.st915.typesafescalajs.dom.tags.Tag
import net.st915.typesafescalajs.renderer.Environment
import org.scalajs.dom.HTMLElement

object CanCreateNativeElement {

  def apply[F[_]](using CanCreateNativeElement[F]): CanCreateNativeElement[F] = summon

}

trait CanCreateNativeElement[F[_]] {

  def createNativeElement[A <: Tag[_]](using Environment): Kleisli[F, A, HTMLElement]

}
