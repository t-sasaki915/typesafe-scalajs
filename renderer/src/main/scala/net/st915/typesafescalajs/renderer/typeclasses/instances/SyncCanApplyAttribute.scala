package net.st915.typesafescalajs.renderer.typeclasses.instances

import cats.data.Kleisli
import cats.effect.{IO, Sync}
import cats.effect.unsafe.IORuntime
import net.st915.typesafescalajs.dom.attributes.Attribute
import net.st915.typesafescalajs.dom.domain.events.*
import net.st915.typesafescalajs.renderer.typeclasses.CanApplyAttribute
import org.scalajs.dom.*

import scala.util.chaining.*

class SyncCanApplyAttribute[F[_]: Sync] extends CanApplyAttribute[F] {

  import net.st915.typesafescalajs.dom.attributes.all.*

  implicit class FunctionOps[A](func: A => IO[Unit]) {

    def unsafeRunWithValue(using IORuntime): A => Unit = value =>
      func(value).unsafeRunAndForget()

  }

  override def applyAttribute[A <: HTMLElement, B, C](attribute: (B, C))(using
  IORuntime): Kleisli[F, A, A] =
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
          case (_: form.type, value: String /* not String. HTMLFormElement */ ) =>
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
          case (_: hrefLang.type, value: String) =>
            element match
              case e: HTMLAnchorElement =>
                e.tap(_.hreflang = value)
              case e: HTMLLinkElement =>
                e.tap(_.hreflang = value)
          case (_: httpEquiv.type, value: String) =>
            element match
              case e: HTMLMetaElement =>
                e.tap(_.httpEquiv = value)
          case (_: isMap.type, value: Boolean) =>
            element match
              case e: HTMLImageElement =>
                e.tap(_.isMap = value)
          case (_: kind.type, value: String) =>
            element match
              case e: HTMLTrackElement =>
                e.tap(_.kind = value)
          case (_: label.type, value: String) =>
            element match
              case e: HTMLTrackElement =>
                e.tap(_.label = value)
              case e: HTMLOptionElement =>
                e.tap(_.label = value)
              case e: HTMLOptGroupElement =>
                e.tap(_.label = value)
          case (_: list.type, value: String /* not String. HTMLElement */ ) =>
            element match
              // TODO
              case e: HTMLInputElement =>
                e
          case (_: loop.type, value: Boolean) =>
            element match
              case e: HTMLAudioElement =>
                e.tap(_.loop = value)
              case e: HTMLVideoElement =>
                e.tap(_.loop = value)
          case (_: max.type, value: String) =>
            element match
              case e: HTMLInputElement =>
                e.tap(_.max = value)
              case e: HTMLProgressElement =>
                e.tap(_.max = value.toDouble)
          case (_: maxLength.type, value: Int) =>
            element match
              case e: HTMLInputElement =>
                e.tap(_.maxLength = value)
              case e: HTMLTextAreaElement =>
                e.tap(_.maxLength = value)
          case (_: media.type, value: String) =>
            element match
              case e: HTMLLinkElement =>
                e.tap(_.media = value)
              case e: HTMLSourceElement =>
                e.tap(_.media = value)
              case e: HTMLStyleElement =>
                e.tap(_.media = value)
          case (_: method.type, value: String) =>
            element match
              case e: HTMLFormElement =>
                e.tap(_.method = value)
          case (_: min.type, value: String) =>
            element match
              case e: HTMLInputElement =>
                e.tap(_.min = value)
          case (_: multiple.type, value: Boolean) =>
            element match
              case e: HTMLInputElement =>
                e.tap(_.multiple = value)
              case e: HTMLSelectElement =>
                e.tap(_.multiple = value)
          case (_: muted.type, value: Boolean) =>
            element match
              case e: HTMLAudioElement =>
                e.tap(_.muted = value)
              case e: HTMLVideoElement =>
                e.tap(_.muted = value)
          case (_: name.type, value: String) =>
            element match
              case e: HTMLButtonElement =>
                e.tap(_.name = value)
              case e: HTMLFormElement =>
                e.tap(_.name = value)
              case e: HTMLIFrameElement =>
                e.tap(_.name = value)
              case e: HTMLInputElement =>
                e.tap(_.name = value)
              case e: HTMLMapElement =>
                e.tap(_.name = value)
              case e: HTMLMetaElement =>
                e.tap(_.name = value)
              case e: HTMLObjectElement =>
                e.tap(_.name = value)
              case e: HTMLParamElement =>
                e.tap(_.name = value)
              case e: HTMLSelectElement =>
                e.tap(_.name = value)
              case e: HTMLTextAreaElement =>
                e.tap(_.name = value)
          case (_: noValidate.type, value: Boolean) =>
            element match
              case e: HTMLFormElement =>
                e.tap(_.noValidate = value)
          case (_: onAbort.type, value: (_ => _)) =>
            value match
              case v: (UIEvent => IO[Unit]) =>
                element match
                  case e: HTMLAudioElement =>
                    e.tap(_.onabort = v.unsafeRunWithValue)
                  case e: HTMLEmbedElement =>
                    e.tap(_.onabort = v.unsafeRunWithValue)
                  case e: HTMLImageElement =>
                    e.tap(_.onabort = v.unsafeRunWithValue)
                  case e: HTMLObjectElement =>
                    e.tap(_.onabort = v.unsafeRunWithValue)
                  case e: HTMLVideoElement =>
                    e.tap(_.onabort = v.unsafeRunWithValue)
          case (_: onAfterPrint.type, value: (_ => _)) =>
            value match
              case v: (Event => IO[Unit]) =>
                element match
                  case e: HTMLBodyElement =>
                    e.tap(_.onafterprint = v.unsafeRunWithValue)
          case (_: onBeforePrint.type, value: (_ => _)) =>
            value match
              case v: (Event => IO[Unit]) =>
                element match
                  case e: HTMLBodyElement =>
                    e.tap(_.onbeforeprint = v.unsafeRunWithValue)
          case (_: onBlur.type, value: (_ => _)) =>
            value match
              case v: (FocusEvent => IO[Unit]) =>
                element.tap(_.onblur = v.unsafeRunWithValue)
          case (_: onCanPlay.type, value: (_ => _)) =>
            value match
              case v: (Event => IO[Unit]) =>
                element match
                  case e: HTMLAudioElement =>
                    e.tap(_.oncanplay = v.unsafeRunWithValue)
                  case e: HTMLEmbedElement =>
                    e.tap(_.oncanplay = v.unsafeRunWithValue)
                  case e: HTMLObjectElement =>
                    e.tap(_.oncanplay = v.unsafeRunWithValue)
                  case e: HTMLVideoElement =>
                    e.tap(_.oncanplay = v.unsafeRunWithValue)
          case (_: onCanPlayThrough.type, value: (_ => _)) =>
            value match
              case v: (Event => IO[Unit]) =>
                element match
                  case e: HTMLAudioElement =>
                    e.tap(_.oncanplaythrough = v.unsafeRunWithValue)
                  case e: HTMLVideoElement =>
                    e.tap(_.oncanplaythrough = v.unsafeRunWithValue)
          case (_: onChange.type, value: (_ => _)) =>
            value match
              case v: (Event => IO[Unit]) =>
                element.tap(_.onchange = v.unsafeRunWithValue)
          case (_: onClick.type, value: (_ => _)) =>
            value match
              case v: (MouseEvent => IO[Unit]) =>
                element.tap(_.onclick = v.unsafeRunWithValue)
          case (_: onContextMenu.type, value: (_ => _)) =>
            value match
              case v: (MouseEvent => IO[Unit]) =>
                element.tap(_.oncontextmenu = v.unsafeRunWithValue)
          case (_: onCopy.type, value: (_ => _)) =>
            value match
              case v: (ClipboardEvent => IO[Unit]) =>
                element.tap(_.oncopy = v.unsafeRunWithValue)
          case (_: onCueChange.type, value: (_ => _)) =>
            value match
              case v: (Event => IO[Unit]) =>
                element match
                  case e: HTMLTrackElement =>
                    e.tap(_.oncuechange = v.unsafeRunWithValue)
          case (_: onCut.type, value: (_ => _)) =>
            value match
              case v: (ClipboardEvent => IO[Unit]) =>
                element.tap(_.oncut = v.unsafeRunWithValue)
          case (_: onDoubleClick.type, value: (_ => _)) =>
            value match
              case v: (MouseEvent => IO[Unit]) =>
                element.tap(_.ondblclick = v.unsafeRunWithValue)
          case (_: onDrag.type, value: (_ => _)) =>
            value match
              case v: (DragEvent => IO[Unit]) =>
                element.tap(_.ondrag = v.unsafeRunWithValue)
          case (_: onDragEnd.type, value: (_ => _)) =>
            value match
              case v: (DragEvent => IO[Unit]) =>
                element.tap(_.ondragend = v.unsafeRunWithValue)
          case (_: onDragEnter.type, value: (_ => _)) =>
            value match
              case v: (DragEvent => IO[Unit]) =>
                element.tap(_.ondragenter = v.unsafeRunWithValue)
          case (_: onDragLeave.type, value: (_ => _)) =>
            value match
              case v: (DragEvent => IO[Unit]) =>
                element.tap(_.ondragleave = v.unsafeRunWithValue)
          case (_: onDragOver.type, value: (_ => _)) =>
            value match
              case v: (DragEvent => IO[Unit]) =>
                element.tap(_.ondragover = v.unsafeRunWithValue)
          case (_: onDragStart.type, value: (_ => _)) =>
            value match
              case v: (DragEvent => IO[Unit]) =>
                element.tap(_.ondragstart = v.unsafeRunWithValue)
          case (_: onDrop.type, value: (_ => _)) =>
            value match
              case v: (DragEvent => IO[Unit]) =>
                element.tap(_.ondrop = v.unsafeRunWithValue)
      }
    }

}
