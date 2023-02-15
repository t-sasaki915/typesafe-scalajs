package net.st915.typesafescalajs.editor.instances

import cats.data.Kleisli
import cats.effect.Sync
import net.st915.typesafescalajs.dom.Environment
import net.st915.typesafescalajs.editor.typeclasses.CanGetNativeElementsByClassName
import org.scalajs.dom.HTMLElement

final class SyncCanGetNativeElementsByClassName[F[_]: Sync]
    extends CanGetNativeElementsByClassName[F] {

  override def getNativeElementsByClassName(using
  Environment): Kleisli[F, String, List[HTMLElement]] = Kleisli { className =>
    Sync[F].blocking {
      summon[Environment]
        .document
        .getElementsByClassName(className)
        .toList
        .map(_.asInstanceOf[HTMLElement])
    }
  }

}
