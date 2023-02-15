package net.st915.typesafescalajs.editor.typeclasses

import cats.data.Kleisli
import net.st915.typesafescalajs.dom.Environment
import org.scalajs.dom.HTMLElement

object CanGetNativeElementById {

  def apply[F[_]](using CanGetNativeElementById[F]): CanGetNativeElementById[F] = summon

}

trait CanGetNativeElementById[F[_]] {

  def getNativeElementById(using Environment): Kleisli[F, String, Option[HTMLElement]]

}
