package net.st915.typesafescalajs.renderer.typeclasses.instances

import cats.data.Kleisli
import cats.effect.Sync
import net.st915.typesafescalajs.dom.attributes.Attribute
import net.st915.typesafescalajs.renderer.typeclasses.CanApplyAttribute
import org.scalajs.dom.*

import scala.util.chaining.*

class SyncCanApplyAttribute[F[_]: Sync] extends CanApplyAttribute[F] {

  import net.st915.typesafescalajs.dom.attributes.all.*

  override def applyAttribute[A <: HTMLElement, B, C](attribute: (B, C)): Kleisli[F, A, A] =
    Kleisli { element =>
      Sync[F].blocking {
        (attribute._1.asInstanceOf[Attribute[C]], attribute._2) match
          case (_: accessKey.type, value: String) =>
            element.tap(_.accessKey = value)
          case (_: className.type, value: String) =>
            element.tap(_.className = value)
          case (_: contentEditable.type, value: Boolean) =>
            element.tap(_.contentEditable = if (value) "true" else "false")
          case (_: dir.type, value: String) =>
            element.tap(_.dir = value)
          case (_: draggable.type, value: Boolean) =>
            element.tap(_.draggable = value)
          case (_: id.type, value: String) =>
            element.tap(_.id = value)
          case (_: lang.type, value: String) =>
            element.tap(_.lang = value)
          case (_: spellCheck.type, value: Boolean) =>
            element.tap(_.spellcheck = value)
          case (_: style.type, value: String) =>
            element.tap(_.style = value)
          case (_: tabIndex.type, value: Int) =>
            element.tap(_.tabIndex = value)
          case (_: title.type, value: String) =>
            element.tap(_.title = value)
          case (_: accept.type, value: String) =>
            element match
              case e: HTMLInputElement =>
                e.tap(_.accept = value)
          case (_: acceptCharset.type, value: String) =>
            element match
              case e: HTMLFormElement =>
                e.tap(_.acceptCharset = value)
          case (_: action.type, value: String) =>
            element match
              case e: HTMLFormElement =>
                e.tap(_.action = value)
          case (_: alt.type, value: String) =>
            element match
              case e: HTMLAreaElement =>
                e.tap(_.alt = value)
              case e: HTMLImageElement =>
                e.tap(_.alt = value)
              case e: HTMLInputElement =>
                e.tap(_.alt = value)
          case (_: async.type, value: Boolean) =>
            element match
              case e: HTMLScriptElement =>
                e.tap(_.async = value)
          case (_: autoComplete.type, value: String) =>
            element match
              case e: HTMLFormElement =>
                e.tap(_.autocomplete = value)
              case e: HTMLInputElement =>
                e.tap(_.autocomplete = value)
          case (_: autoFocus.type, value: String) =>
            element match
              case e: HTMLButtonElement =>
                e.tap(_.autofocus = value)
              case e: HTMLInputElement =>
                e.tap(_.autofocus = value)
              case e: HTMLSelectElement =>
                e.tap(_.autofocus = value)
              case e: HTMLTextAreaElement =>
                e.tap(_.autofocus = value)
          case (_: autoPlay.type, value: Boolean) =>
            element match
              case e: HTMLAudioElement =>
                e.tap(_.autoplay = value)
              case e: HTMLVideoElement =>
                e.tap(_.autoplay = value)
          case (_: charset.type, value: String) =>
            element match
              case e: HTMLMetaElement =>
                e.tap(_.charset = value)
              case e: HTMLScriptElement =>
                e.tap(_.charset = value)
          case (attr, _) =>
            println(s"Ignoring attribute '$attr'.")
            element
      }
    }

}
