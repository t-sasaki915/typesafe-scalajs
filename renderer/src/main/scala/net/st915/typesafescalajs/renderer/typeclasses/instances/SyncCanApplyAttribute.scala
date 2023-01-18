package net.st915.typesafescalajs.renderer.typeclasses.instances

import cats.effect.Sync
import net.st915.typesafescalajs.dom.attributes.Attribute
import net.st915.typesafescalajs.renderer.typeclasses.CanApplyAttribute
import org.scalajs.dom.*

import scala.util.chaining.*

class SyncCanApplyAttribute[F[_]: Sync] extends CanApplyAttribute[F] {

  import net.st915.typesafescalajs.dom.attributes.global.*
  import net.st915.typesafescalajs.dom.attributes.html.*

  override def applyAttribute[A <: HTMLElement, B](element: A)(attribute: (_, B)): F[Unit] =
    Sync[F].blocking {
      (attribute._1.asInstanceOf[Attribute[B]], attribute._2) match
        case (_: accessKey.type, value: String) =>
          element.accessKey = value
        case (_: className.type, value: String) =>
          element.className = value
        case (_: contentEditable.type, value: Boolean) =>
          element.contentEditable = if (value) "true" else "false"
        case (_: dir.type, value: String) =>
          element.dir = value
        case (_: draggable.type, value: Boolean) =>
          element.draggable = value
        case (_: id.type, value: String) =>
          element.id = value
        case (_: lang.type, value: String) =>
          element.lang = value
        case (_: spellCheck.type, value: Boolean) =>
          element.spellcheck = value
        case (_: style.type, value: String) =>
          element.style = value
        case (_: tabIndex.type, value: Int) =>
          element.tabIndex = value
        case (_: title.type, value: String) =>
          element.title = value
        case (_: accept.type, value: String) =>
          element match
            case e: HTMLInputElement =>
              e.tap(_.accept = value).pipe(_.asInstanceOf[HTMLElement])
        case (_: acceptCharset.type, value: String) =>
          element match
            case e: HTMLFormElement =>
              e.tap(_.acceptCharset = value).pipe(_.asInstanceOf[HTMLElement])
        case (_: action.type, value: String) =>
          element match
            case e: HTMLFormElement =>
              e.tap(_.action = value).pipe(_.asInstanceOf[HTMLElement])
        case (_: alt.type, value: String) =>
          element match
            case e: HTMLAreaElement =>
              e.tap(_.alt = value).pipe(_.asInstanceOf[HTMLElement])
            case e: HTMLImageElement =>
              e.tap(_.alt = value).pipe(_.asInstanceOf[HTMLElement])
            case e: HTMLInputElement =>
              e.tap(_.alt = value).pipe(_.asInstanceOf[HTMLElement])
        case (_: async.type, value: Boolean) =>
          element match
            case e: HTMLScriptElement =>
              e.tap(_.async = value).pipe(_.asInstanceOf[HTMLElement])
        case (_: autoComplete.type, value: String) =>
          element match
            case e: HTMLFormElement =>
              e.tap(_.autocomplete = value).pipe(_.asInstanceOf[HTMLElement])
            case e: HTMLInputElement =>
              e.tap(_.autocomplete = value).pipe(_.asInstanceOf[HTMLElement])
        case (_: autoFocus.type, value: String) =>
          element match
            case e: HTMLButtonElement =>
              e.tap(_.autofocus = value).pipe(_.asInstanceOf[HTMLElement])
            case e: HTMLInputElement =>
              e.tap(_.autofocus = value).pipe(_.asInstanceOf[HTMLElement])
            case e: HTMLSelectElement =>
              e.tap(_.autofocus = value).pipe(_.asInstanceOf[HTMLElement])
            case e: HTMLTextAreaElement =>
              e.tap(_.autofocus = value).pipe(_.asInstanceOf[HTMLElement])
        case (_: autoPlay.type, value: Boolean) =>
          element match
            case e: HTMLAudioElement =>
              e.tap(_.autoplay = value).pipe(_.asInstanceOf[HTMLElement])
            case e: HTMLVideoElement =>
              e.tap(_.autoplay = value).pipe(_.asInstanceOf[HTMLElement])
        case (_: charset.type, value: String) =>
          element match
            case e: HTMLMetaElement =>
              e.tap(_.charset = value).pipe(_.asInstanceOf[HTMLElement])
            case e: HTMLScriptElement =>
              e.tap(_.charset = value).pipe(_.asInstanceOf[HTMLElement])
        case (attr, _) =>
          println(s"Ignoring attribute '$attr'.")
    }

}
