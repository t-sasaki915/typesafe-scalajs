package net.st915.typesafescalajs.renderer.instances

import cats.data.Kleisli
import cats.effect.unsafe.IORuntime
import cats.effect.{IO, Sync}
import net.st915.typesafescalajs.dom.attributes.Attribute
import net.st915.typesafescalajs.dom.domain.events.*
import net.st915.typesafescalajs.dom.predefvalues.SandboxValue
import net.st915.typesafescalajs.renderer.typeclasses.CanApplyAttribute
import org.scalajs.dom.*

import scala.util.chaining.*

final class SyncCanApplyAttribute[F[_]: Sync] extends CanApplyAttribute[F] {

  import net.st915.typesafescalajs.dom.attributes.all.*

  implicit class FunctionOps[A](func: A => IO[Unit]) {

    def unsafeRunEvent(using IORuntime): A => Unit = value =>
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
                    e.tap(_.onabort = v.unsafeRunEvent)
                  case e: HTMLEmbedElement =>
                    e.tap(_.onabort = v.unsafeRunEvent)
                  case e: HTMLImageElement =>
                    e.tap(_.onabort = v.unsafeRunEvent)
                  case e: HTMLObjectElement =>
                    e.tap(_.onabort = v.unsafeRunEvent)
                  case e: HTMLVideoElement =>
                    e.tap(_.onabort = v.unsafeRunEvent)
          case (_: onAfterPrint.type, value: (_ => _)) =>
            value match
              case v: (Event => IO[Unit]) =>
                element match
                  case e: HTMLBodyElement =>
                    e.tap(_.onafterprint = v.unsafeRunEvent)
          case (_: onBeforePrint.type, value: (_ => _)) =>
            value match
              case v: (Event => IO[Unit]) =>
                element match
                  case e: HTMLBodyElement =>
                    e.tap(_.onbeforeprint = v.unsafeRunEvent)
          case (_: onBlur.type, value: (_ => _)) =>
            value match
              case v: (FocusEvent => IO[Unit]) =>
                element.tap(_.onblur = v.unsafeRunEvent)
          case (_: onCanPlay.type, value: (_ => _)) =>
            value match
              case v: (Event => IO[Unit]) =>
                element match
                  case e: HTMLAudioElement =>
                    e.tap(_.oncanplay = v.unsafeRunEvent)
                  case e: HTMLEmbedElement =>
                    e.tap(_.oncanplay = v.unsafeRunEvent)
                  case e: HTMLObjectElement =>
                    e.tap(_.oncanplay = v.unsafeRunEvent)
                  case e: HTMLVideoElement =>
                    e.tap(_.oncanplay = v.unsafeRunEvent)
          case (_: onCanPlayThrough.type, value: (_ => _)) =>
            value match
              case v: (Event => IO[Unit]) =>
                element match
                  case e: HTMLAudioElement =>
                    e.tap(_.oncanplaythrough = v.unsafeRunEvent)
                  case e: HTMLVideoElement =>
                    e.tap(_.oncanplaythrough = v.unsafeRunEvent)
          case (_: onChange.type, value: (_ => _)) =>
            value match
              case v: (Event => IO[Unit]) =>
                element.tap(_.onchange = v.unsafeRunEvent)
          case (_: onClick.type, value: (_ => _)) =>
            value match
              case v: (MouseEvent => IO[Unit]) =>
                element.tap(_.onclick = v.unsafeRunEvent)
          case (_: onContextMenu.type, value: (_ => _)) =>
            value match
              case v: (MouseEvent => IO[Unit]) =>
                element.tap(_.oncontextmenu = v.unsafeRunEvent)
          case (_: onCopy.type, value: (_ => _)) =>
            value match
              case v: (ClipboardEvent => IO[Unit]) =>
                element.tap(_.oncopy = v.unsafeRunEvent)
          case (_: onCueChange.type, value: (_ => _)) =>
            value match
              case v: (Event => IO[Unit]) =>
                element match
                  case e: HTMLTrackElement =>
                    e.tap(_.oncuechange = v.unsafeRunEvent)
          case (_: onCut.type, value: (_ => _)) =>
            value match
              case v: (ClipboardEvent => IO[Unit]) =>
                element.tap(_.oncut = v.unsafeRunEvent)
          case (_: onDoubleClick.type, value: (_ => _)) =>
            value match
              case v: (MouseEvent => IO[Unit]) =>
                element.tap(_.ondblclick = v.unsafeRunEvent)
          case (_: onDrag.type, value: (_ => _)) =>
            value match
              case v: (DragEvent => IO[Unit]) =>
                element.tap(_.ondrag = v.unsafeRunEvent)
          case (_: onDragEnd.type, value: (_ => _)) =>
            value match
              case v: (DragEvent => IO[Unit]) =>
                element.tap(_.ondragend = v.unsafeRunEvent)
          case (_: onDragEnter.type, value: (_ => _)) =>
            value match
              case v: (DragEvent => IO[Unit]) =>
                element.tap(_.ondragenter = v.unsafeRunEvent)
          case (_: onDragLeave.type, value: (_ => _)) =>
            value match
              case v: (DragEvent => IO[Unit]) =>
                element.tap(_.ondragleave = v.unsafeRunEvent)
          case (_: onDragOver.type, value: (_ => _)) =>
            value match
              case v: (DragEvent => IO[Unit]) =>
                element.tap(_.ondragover = v.unsafeRunEvent)
          case (_: onDragStart.type, value: (_ => _)) =>
            value match
              case v: (DragEvent => IO[Unit]) =>
                element.tap(_.ondragstart = v.unsafeRunEvent)
          case (_: onDrop.type, value: (_ => _)) =>
            value match
              case v: (DragEvent => IO[Unit]) =>
                element.tap(_.ondrop = v.unsafeRunEvent)
          case (_: onDurationChange.type, value: (_ => _)) =>
            value match
              case v: (Event => IO[Unit]) =>
                element match
                  case e: HTMLAudioElement =>
                    e.tap(_.ondurationchange = v.unsafeRunEvent)
                  case e: HTMLVideoElement =>
                    e.tap(_.ondurationchange = v.unsafeRunEvent)
          case (_: onEmptied.type, value: (_ => _)) =>
            value match
              case v: (Event => IO[Unit]) =>
                element match
                  case e: HTMLAudioElement =>
                    e.tap(_.onemptied = v.unsafeRunEvent)
                  case e: HTMLVideoElement =>
                    e.tap(_.onemptied = v.unsafeRunEvent)
          case (_: onEnded.type, value: (_ => _)) =>
            value match
              case v: (Event => IO[Unit]) =>
                element match
                  case e: HTMLAudioElement =>
                    e.tap(_.onended = v.unsafeRunEvent)
                  case e: HTMLVideoElement =>
                    e.tap(_.onended = v.unsafeRunEvent)
          case (_: onError.type, value: (_ => _)) =>
            value match
              case v: (ErrorEvent => IO[Unit]) =>
                element match
                  case e: HTMLBodyElement =>
                    e.tap(_.onerror = v.unsafeRunEvent)
          case (_: onFocus.type, value: (_ => _)) =>
            value match
              case v: (FocusEvent => IO[Unit]) =>
                element.tap(_.onfocus = v.unsafeRunEvent)
          case (_: onHashChange.type, value: (_ => _)) =>
            value match
              case v: (Event => IO[Unit]) =>
                element match
                  case e: HTMLBodyElement =>
                    e.tap(_.onhashchange = v.unsafeRunEvent)
          case (_: onInput.type, value: (_ => _)) =>
            value match
              case v: (Event => IO[Unit]) =>
                element.tap(_.oninput = v.unsafeRunEvent)
          case (_: onKeyDown.type, value: (_ => _)) =>
            value match
              case v: (KeyboardEvent => IO[Unit]) =>
                element.tap(_.onkeydown = v.unsafeRunEvent)
          case (_: onKeyPress.type, value: (_ => _)) =>
            value match
              case v: (KeyboardEvent => IO[Unit]) =>
                element.tap(_.onkeypress = v.unsafeRunEvent)
          case (_: onKeyUp.type, value: (_ => _)) =>
            value match
              case v: (KeyboardEvent => IO[Unit]) =>
                element.tap(_.onkeyup = v.unsafeRunEvent)
          case (_: onLoad.type, value: (_ => _)) =>
            value match
              case v: (Event => IO[Unit]) =>
                element match
                  case e: HTMLBodyElement =>
                    e.tap(_.onload = v.unsafeRunEvent)
                  case e: HTMLIFrameElement =>
                    e.tap(_.onload = v.unsafeRunEvent)
                  case e: HTMLImageElement =>
                    e.tap(_.onload = v.unsafeRunEvent)
                  case e: HTMLScriptElement =>
                    e.tap(_.onload = v.unsafeRunEvent)
          case (_: onLoadedData.type, value: (_ => _)) =>
            value match
              case v: (Event => IO[Unit]) =>
                element match
                  case e: HTMLAudioElement =>
                    e.tap(_.onloadeddata = v.unsafeRunEvent)
                  case e: HTMLVideoElement =>
                    e.tap(_.onloadeddata = v.unsafeRunEvent)
          case (_: onLoadedMetaData.type, value: (_ => _)) =>
            value match
              case v: (Event => IO[Unit]) =>
                element match
                  case e: HTMLAudioElement =>
                    e.tap(_.onloadedmetadata = v.unsafeRunEvent)
                  case e: HTMLVideoElement =>
                    e.tap(_.onloadedmetadata = v.unsafeRunEvent)
          case (_: onLoadStart.type, value: (_ => _)) =>
            value match
              case v: (Event => IO[Unit]) =>
                element match
                  case e: HTMLAudioElement =>
                    e.tap(_.onloadstart = v.unsafeRunEvent)
                  case e: HTMLVideoElement =>
                    e.tap(_.onloadstart = v.unsafeRunEvent)
          case (_: onMouseDown.type, value: (_ => _)) =>
            value match
              case v: (MouseEvent => IO[Unit]) =>
                element.tap(_.onmousedown = v.unsafeRunEvent)
          case (_: onMouseMove.type, value: (_ => _)) =>
            value match
              case v: (MouseEvent => IO[Unit]) =>
                element.tap(_.onmousemove = v.unsafeRunEvent)
          case (_: onMouseOut.type, value: (_ => _)) =>
            value match
              case v: (MouseEvent => IO[Unit]) =>
                element.tap(_.onmouseout = v.unsafeRunEvent)
          case (_: onMouseOver.type, value: (_ => _)) =>
            value match
              case v: (MouseEvent => IO[Unit]) =>
                element.tap(_.onmouseover = v.unsafeRunEvent)
          case (_: onMouseUp.type, value: (_ => _)) =>
            value match
              case v: (MouseEvent => IO[Unit]) =>
                element.tap(_.onmouseup = v.unsafeRunEvent)
          case (_: onMouseWheel.type, value: (_ => _)) =>
            value match
              case v: (WheelEvent => IO[Unit]) =>
                element.tap(_.onmousewheel = v.unsafeRunEvent)
          case (_: onOffline.type, value: (_ => _)) =>
            value match
              case v: (Event => IO[Unit]) =>
                element match
                  case e: HTMLBodyElement =>
                    e.tap(_.onoffline = v.unsafeRunEvent)
          case (_: onOnline.type, value: (_ => _)) =>
            value match
              case v: (Event => IO[Unit]) =>
                element match
                  case e: HTMLBodyElement =>
                    e.tap(_.ononline = v.unsafeRunEvent)
          case (_: onPaste.type, value: (_ => _)) =>
            value match
              case v: (ClipboardEvent => IO[Unit]) =>
                element.tap(_.onpaste = v.unsafeRunEvent)
          case (_: onPause.type, value: (_ => _)) =>
            value match
              case v: (Event => IO[Unit]) =>
                element match
                  case e: HTMLAudioElement =>
                    e.tap(_.onpause = v.unsafeRunEvent)
                  case e: HTMLVideoElement =>
                    e.tap(_.onpause = v.unsafeRunEvent)
          case (_: onPlay.type, value: (_ => _)) =>
            value match
              case v: (Event => IO[Unit]) =>
                element match
                  case e: HTMLAudioElement =>
                    e.tap(_.onplay = v.unsafeRunEvent)
                  case e: HTMLVideoElement =>
                    e.tap(_.onplay = v.unsafeRunEvent)
          case (_: onPlaying.type, value: (_ => _)) =>
            value match
              case v: (Event => IO[Unit]) =>
                element match
                  case e: HTMLAudioElement =>
                    e.tap(_.onplaying = v.unsafeRunEvent)
                  case e: HTMLVideoElement =>
                    e.tap(_.onplaying = v.unsafeRunEvent)
          case (_: onPopState.type, value: (_ => _)) =>
            value match
              case v: (PopStateEvent => IO[Unit]) =>
                element match
                  case e: HTMLBodyElement =>
                    e.tap(_.onpopstate = v.unsafeRunEvent)
          case (_: onRateChange.type, value: (_ => _)) =>
            value match
              case v: (Event => IO[Unit]) =>
                element match
                  case e: HTMLAudioElement =>
                    e.tap(_.onratechange = v.unsafeRunEvent)
                  case e: HTMLVideoElement =>
                    e.tap(_.onratechange = v.unsafeRunEvent)
          case (_: onReset.type, value: (_ => _)) =>
            value match
              case v: (Event => IO[Unit]) =>
                element match
                  case e: HTMLFormElement =>
                    e.tap(_.onreset = v.unsafeRunEvent)
          case (_: onResize.type, value: (_ => _)) =>
            value match
              case v: (UIEvent => IO[Unit]) =>
                element match
                  case e: HTMLBodyElement =>
                    e.tap(_.onresize = v.unsafeRunEvent)
          case (_: onScroll.type, value: (_ => _)) =>
            value match
              case v: (UIEvent => IO[Unit]) =>
                element.tap(_.onscroll = v.unsafeRunEvent)
          case (_: onSeeked.type, value: (_ => _)) =>
            value match
              case v: (Event => IO[Unit]) =>
                element match
                  case e: HTMLAudioElement =>
                    e.tap(_.onseeked = v.unsafeRunEvent)
                  case e: HTMLVideoElement =>
                    e.tap(_.onseeked = v.unsafeRunEvent)
          case (_: onSeeking.type, value: (_ => _)) =>
            value match
              case v: (Event => IO[Unit]) =>
                element match
                  case e: HTMLAudioElement =>
                    e.tap(_.onseeking = v.unsafeRunEvent)
                  case e: HTMLVideoElement =>
                    e.tap(_.onseeking = v.unsafeRunEvent)
          case (_: onSelect.type, value: (_ => _)) =>
            value match
              case v: (UIEvent => IO[Unit]) =>
                element.tap(_.onselect = v.unsafeRunEvent)
          case (_: onStalled.type, value: (_ => _)) =>
            value match
              case v: (Event => IO[Unit]) =>
                element match
                  case e: HTMLAudioElement =>
                    e.tap(_.onstalled = v.unsafeRunEvent)
                  case e: HTMLVideoElement =>
                    e.tap(_.onstalled = v.unsafeRunEvent)
          case (_: onStorage.type, value: (_ => _)) =>
            value match
              case v: (StorageEvent => IO[Unit]) =>
                element match
                  case e: HTMLBodyElement =>
                    e.tap(_.onstorage = v.unsafeRunEvent)
          case (_: onSubmit.type, value: (_ => _)) =>
            value match
              case v: (Event => IO[Unit]) =>
                element match
                  case e: HTMLFormElement =>
                    e.tap(_.onsubmit = v.unsafeRunEvent)
          case (_: onSuspend.type, value: (_ => _)) =>
            value match
              case v: (Event => IO[Unit]) =>
                element match
                  case e: HTMLAudioElement =>
                    e.tap(_.onsuspend = v.unsafeRunEvent)
                  case e: HTMLVideoElement =>
                    e.tap(_.onsuspend = v.unsafeRunEvent)
          case (_: onTimeUpdate.type, value: (_ => _)) =>
            value match
              case v: (Event => IO[Unit]) =>
                element match
                  case e: HTMLAudioElement =>
                    e.tap(_.ontimeupdate = v.unsafeRunEvent)
                  case e: HTMLVideoElement =>
                    e.tap(_.ontimeupdate = v.unsafeRunEvent)
          case (_: onUnload.type, value: (_ => _)) =>
            value match
              case v: (Event => IO[Unit]) =>
                element match
                  case e: HTMLBodyElement =>
                    e.tap(_.onunload = v.unsafeRunEvent)
          case (_: onVolumeChange.type, value: (_ => _)) =>
            value match
              case v: (Event => IO[Unit]) =>
                element match
                  case e: HTMLAudioElement =>
                    e.tap(_.onvolumechange = v.unsafeRunEvent)
                  case e: HTMLVideoElement =>
                    e.tap(_.onvolumechange = v.unsafeRunEvent)
          case (_: onWaiting.type, value: (_ => _)) =>
            value match
              case v: (Event => IO[Unit]) =>
                element match
                  case e: HTMLAudioElement =>
                    e.tap(_.onwaiting = v.unsafeRunEvent)
                  case e: HTMLVideoElement =>
                    e.tap(_.onwaiting = v.unsafeRunEvent)
          case (_: onWheel.type, value: (_ => _)) =>
            value match
              case v: (MouseEvent => IO[Unit]) =>
                element match
                  case e: HTMLAudioElement =>
                    e.tap(_.onwheel = v.unsafeRunEvent)
                  case e: HTMLVideoElement =>
                    e.tap(_.onwheel = v.unsafeRunEvent)
          case (_: pattern.type, value: String) =>
            element match
              case e: HTMLInputElement =>
                e.tap(_.pattern = value)
          case (_: placeholder.type, value: String) =>
            element match
              case e: HTMLInputElement =>
                e.tap(_.placeholder = value)
              case e: HTMLTextAreaElement =>
                e.tap(_.placeholder = value)
          case (_: poster.type, value: String) =>
            element match
              case e: HTMLVideoElement =>
                e.tap(_.poster = value)
          case (_: preload.type, value: String) =>
            element match
              case e: HTMLAudioElement =>
                e.tap(_.preload = value)
              case e: HTMLVideoElement =>
                e.tap(_.preload = value)
          case (_: readonly.type, value: Boolean) =>
            element match
              case e: HTMLInputElement =>
                e.tap(_.readOnly = value)
              case e: HTMLTextAreaElement =>
                e.tap(_.readOnly = value)
          case (_: rel.type, value: String) =>
            element match
              case e: HTMLAnchorElement =>
                e.tap(_.rel = value)
              case e: HTMLLinkElement =>
                e.tap(_.rel = value)
          case (_: required.type, value: Boolean) =>
            element match
              case e: HTMLInputElement =>
                e.tap(_.required = value)
              case e: HTMLSelectElement =>
                e.tap(_.required = value)
              case e: HTMLTextAreaElement =>
                e.tap(_.required = value)
          case (_: rows.type, value: Int) =>
            element match
              case e: HTMLTextAreaElement =>
                e.tap(_.rows = value)
          case (_: rowSpan.type, value: Int) =>
            element match
              case e: HTMLTableCellElement =>
                e.tap(_.rowSpan = value)
          case (_: sandbox.type, value: Set[_]) =>
            value match
              case values: Set[SandboxValue] =>
                element match
                  case e: HTMLIFrameElement =>
                    if (values.nonEmpty)
                      values
                        .map(_.raw)
                        .foldLeft(e) { (acc, r) => acc.tap(_.sandbox.add(r)) }
                    else
                      e.tap(_.setAttribute("sandbox", ""))
          case (_: selected.type, value: Boolean) =>
            element match
              case e: HTMLOptionElement =>
                e.tap(_.selected = value)
          case (_: shape.type, value: String) =>
            element match
              case e: HTMLAreaElement =>
                e.tap(_.shape = value)
          case (_: size.type, value: Int) =>
            element match
              case e: HTMLInputElement =>
                e.tap(_.size = value)
              case e: HTMLSelectElement =>
                e.tap(_.size = value)
          case (_: span.type, value: Int) =>
            element match
              case e: HTMLTableColElement =>
                e.tap(_.span = value)
          case (_: src.type, value: String) =>
            element match
              case e: HTMLAudioElement =>
                e.tap(_.src = value)
              case e: HTMLEmbedElement =>
                e.tap(_.src = value)
              case e: HTMLIFrameElement =>
                e.tap(_.src = value)
              case e: HTMLImageElement =>
                e.tap(_.src = value)
              case e: HTMLInputElement =>
                e.tap(_.src = value)
              case e: HTMLScriptElement =>
                e.tap(_.src = value)
              case e: HTMLSourceElement =>
                e.tap(_.src = value)
              case e: HTMLTrackElement =>
                e.tap(_.src = value)
              case e: HTMLVideoElement =>
                e.tap(_.src = value)
          case (_: srcLang.type, value: String) =>
            element match
              case e: HTMLTrackElement =>
                e.tap(_.srclang = value)
          case (_: start.type, value: Int) =>
            element match
              case e: HTMLOListElement =>
                e.tap(_.start = value)
          case (_: step.type, value: Int) =>
            element match
              case e: HTMLInputElement =>
                e.tap(_.step = value.toString)
          case (_: target.type, value: String) =>
            element match
              case e: HTMLAnchorElement =>
                e.tap(_.target = value)
              case e: HTMLAreaElement =>
                e.tap(_.target = value)
              case e: HTMLBaseElement =>
                e.tap(_.target = value)
              case e: HTMLFormElement =>
                e.tap(_.target = value)
          case (_: `type`.type, value: String) =>
            element match
              case e: HTMLAnchorElement =>
                e.tap(_.`type` = value)
              case e: HTMLButtonElement =>
                e.tap(_.`type` = value)
              case e: HTMLInputElement =>
                e.tap(_.`type` = value)
              case e: HTMLLinkElement =>
                e.tap(_.`type` = value)
              case e: HTMLMenuElement =>
                e.tap(_.`type` = value)
              case e: HTMLObjectElement =>
                e.tap(_.`type` = value)
              case e: HTMLScriptElement =>
                e.tap(_.`type` = value)
              case e: HTMLSourceElement =>
                e.tap(_.`type` = value)
              case e: HTMLStyleElement =>
                e.tap(_.`type` = value)
          case (_: useMap.type, value: String) =>
            element match
              case e: HTMLImageElement =>
                e.tap(_.useMap = value)
              case e: HTMLObjectElement =>
                e.tap(_.useMap = value)
          case (_: value.type, value: String) =>
            element match
              case e: HTMLButtonElement =>
                e.tap(_.value = value)
              case e: HTMLInputElement =>
                e.tap(_.value = value)
              case e: HTMLOptionElement =>
                e.tap(_.value = value)
              case e: HTMLParamElement =>
                e.tap(_.value = value)
          case (_: width.type, value: Int) =>
            element match
              case e: HTMLCanvasElement =>
                e.tap(_.width = value)
              case e: HTMLEmbedElement =>
                e.tap(_.width = value.toString)
              case e: HTMLIFrameElement =>
                e.tap(_.width = value.toString)
              case e: HTMLImageElement =>
                e.tap(_.width = value)
              case e: HTMLInputElement =>
                e.tap(_.width = value.toString)
              case e: HTMLObjectElement =>
                e.tap(_.width = value.toString)
              case e: HTMLVideoElement =>
                e.tap(_.width = value)
          case (_: wrap.type, value: String) =>
            element match
              case e: HTMLTextAreaElement =>
                e.tap(_.wrap = value)
      }
    }

}
