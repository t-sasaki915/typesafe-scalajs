package net.st915.typesafescalajs.editor.typeclasses

import cats.data.Kleisli
import net.st915.typesafescalajs.dom.Environment
import org.scalajs.dom.HTMLElement

object CanGetNativeElementsByClassName {

  def apply[F[_]](using CanGetNativeElementsByClassName[F]): CanGetNativeElementsByClassName[F] =
    summon

}

trait CanGetNativeElementsByClassName[F[_]] {

  def getNativeElementsByClassName(using Environment): Kleisli[F, String, List[HTMLElement]]

}
