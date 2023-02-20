package net.st915.typesafescalajs.editor

import cats.data.Kleisli
import cats.effect.Sync
import net.st915.typesafescalajs.dom.Environment
import net.st915.typesafescalajs.editor.typeclasses.*
import org.scalajs.dom.HTMLElement

final case class Editor[F[_]: Sync]()(using Environment) {

  import net.st915.typesafescalajs.editor.instances.all.given

  val getNativeElementById: Kleisli[F, String, Option[HTMLElement]] =
    CanGetNativeElementById[F].getNativeElementById

  val getNativeElementsByClassName: Kleisli[F, String, List[HTMLElement]] =
    CanGetNativeElementsByClassName[F].getNativeElementsByClassName

}
