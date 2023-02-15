package net.st915.typesafescalajs.editor.instances

import cats.data.Kleisli
import cats.effect.Sync
import net.st915.typesafescalajs.dom.Environment
import net.st915.typesafescalajs.editor.errors.EditorError
import net.st915.typesafescalajs.editor.errors.EditorError.*
import net.st915.typesafescalajs.editor.typeclasses.CanGetNativeElementById
import org.scalajs.dom.HTMLElement

import scala.util.chaining.*

final class SyncCanGetNativeElementById[F[_]: Sync] extends CanGetNativeElementById[F] {

  override def getNativeElementById(using
  Environment): Kleisli[F, String, Either[EditorError, HTMLElement]] = Kleisli { id =>
    Sync[F].blocking {
      summon[Environment]
        .document
        .getElementById(id)
        .asInstanceOf[HTMLElement]
        .pipe { nativeElem =>
          if (nativeElem eq null)
            Left(ElementNotFound(id))
          else
            Right(nativeElem)
        }
    }
  }

}
