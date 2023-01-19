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
          case (_: checked.type, value: Boolean) =>
            element match
              case e: HTMLInputElement =>
                e.tap(_.checked = value)
          case (_: cite.type, value: String) =>
            element match
              case e: HTMLQuoteElement =>
                e.tap(_.cite = value)
          case (_: cols.type, value: Int) =>
            element match
              case e: HTMLTextAreaElement =>
                e.tap(_.cols = value)
          case (_: colSpan.type, value: Int) =>
            element match
              case e: HTMLTableCellElement =>
                e.tap(_.colSpan = value)
          case (_: content.type, value: String) =>
            element match
              case e: HTMLMetaElement =>
                e.tap(_.content = value)
          case (_: controls.type, value: Boolean) =>
            element match
              case e: HTMLAudioElement =>
                e.tap(_.controls = value)
              case e: HTMLVideoElement =>
                e.tap(_.controls = value)
          case (_: coords.type, value: String) =>
            element match
              case e: HTMLAreaElement =>
                e.tap(_.coords = value)
          case (_: data.type, value: String) =>
            element match
              case e: HTMLObjectElement =>
                e.tap(_.data = value)
          case (_: defer.type, value: Boolean) =>
            element match
              case e: HTMLScriptElement =>
                e.tap(_.defer = value)
          case (_: disabled.type, value: Boolean) =>
            element match
              case e: HTMLButtonElement =>
                e.tap(_.disabled = value)
              case e: HTMLFieldSetElement =>
                e.tap(_.disabled = value)
              case e: HTMLInputElement =>
                e.tap(_.disabled = value)
              case e: HTMLOptGroupElement =>
                e.tap(_.disabled = value)
              case e: HTMLOptionElement =>
                e.tap(_.disabled = value)
              case e: HTMLSelectElement =>
                e.tap(_.disabled = value)
              case e: HTMLTextAreaElement =>
                e.tap(_.disabled = value)
          case (_: encType.type, value: String) =>
            element match
              case e: HTMLFormElement =>
                e.tap(_.enctype = value)
          case (_: form.type, value: String) =>
            // TODO
            element match
              case e: HTMLButtonElement =>
                e
              case e: HTMLFieldSetElement =>
                e
              case e: HTMLInputElement =>
                e
              case e: HTMLLabelElement =>
                e
              case e: HTMLObjectElement =>
                e
              case e: HTMLSelectElement =>
                e
              case e: HTMLTextAreaElement =>
                e
          case (_: formAction.type, value: String) =>
            element match
              case e: HTMLButtonElement =>
                e.tap(_.formAction = value)
              case e: HTMLInputElement =>
                e.tap(_.formAction = value)
          case (_: height.type, value: Int) =>
            element match
              case e: HTMLCanvasElement =>
                e.tap(_.height = value)
              case e: HTMLEmbedElement =>
                e.tap(_.height = value.toString)
              case e: HTMLIFrameElement =>
                e.tap(_.height = value.toString)
              case e: HTMLImageElement =>
                e.tap(_.height = value)
              case e: HTMLInputElement =>
                e.tap(_.height = value.toString)
              case e: HTMLObjectElement =>
                e.tap(_.height = value.toString)
              case e: HTMLVideoElement =>
                e.tap(_.height = value)
          case (_: href.type, value: String) =>
            element match
              case e: HTMLAnchorElement =>
                e.tap(_.href = value)
              case e: HTMLAreaElement =>
                e.tap(_.href = value)
              case e: HTMLBaseElement =>
                e.tap(_.href = value)
              case e: HTMLLinkElement =>
                e.tap(_.href = value)
          case (attr, _) =>
            println(s"Ignoring attribute '$attr'.")
            element
      }
    }

}
