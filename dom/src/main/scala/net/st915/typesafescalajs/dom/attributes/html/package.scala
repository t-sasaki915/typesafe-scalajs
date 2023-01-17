package net.st915.typesafescalajs.dom.attributes

import cats.effect.IO
import net.st915.typesafescalajs.dom.attributes.{Attribute, FlagAttribute}
import net.st915.typesafescalajs.dom.domain.events.*

/**
 * *
 * @see
 *   https://www.w3schools.com/tags/ref_attributes.asp
 */
package object html {

  sealed trait VisibleElementAttribute
  sealed trait AnchorAttribute
  sealed trait AreaAttribute
  sealed trait AudioAttribute
  sealed trait BRAttribute
  sealed trait BaseAttribute
  sealed trait BodyAttribute
  sealed trait ButtonAttribute
  sealed trait CanvasAttribute
  sealed trait DialogAttribute
  sealed trait DivAttribute
  sealed trait EmbedAttribute
  sealed trait FieldSetAttribute
  sealed trait FormAttribute
  sealed trait HRAttribute
  sealed trait HeadAttribute
  sealed trait HeadingAttribute
  sealed trait IFrameAttribute
  sealed trait ImageAttribute
  sealed trait InputAttribute
  sealed trait LinkAttribute
  sealed trait LIAttribute
  sealed trait LabelAttribute
  sealed trait LegendAttribute
  sealed trait MapAttribute
  sealed trait MenuAttribute
  sealed trait MetaAttribute
  sealed trait OListAttribute
  sealed trait ObjectAttribute
  sealed trait OptGroupAttribute
  sealed trait OptionAttribute
  sealed trait ParagraphAttribute
  sealed trait ParamAttribute
  sealed trait PreAttribute
  sealed trait ProgressAttribute
  sealed trait QuoteAttribute
  sealed trait ScriptAttribute
  sealed trait SelectAttribute
  sealed trait SourceAttribute
  sealed trait SpanAttribute
  sealed trait StyleAttribute
  sealed trait TableAttribute
  sealed trait TableCaptionAttribute
  sealed trait TableCellAttribute
  sealed trait TableColAttribute
  sealed trait TableRowAttribute
  sealed trait TableSectionAttribute
  sealed trait TextAreaAttribute
  sealed trait TitleAttribute
  sealed trait TrackAttribute
  sealed trait VideoAttribute

  case object accept extends Attribute[String] with InputAttribute

  case object acceptCharset extends Attribute[String] with FormAttribute

  case object action extends Attribute[String] with FormAttribute

  case object alt extends Attribute[String] with AreaAttribute with ImageAttribute
      with InputAttribute

  case object async extends FlagAttribute with ScriptAttribute

  case object autoComplete extends FlagAttribute with FormAttribute with InputAttribute

  case object autoFocus extends FlagAttribute with ButtonAttribute with InputAttribute
      with SelectAttribute with TextAreaAttribute

  case object autoPlay extends FlagAttribute with AudioAttribute with VideoAttribute

  case object charset extends Attribute[String] with MetaAttribute with ScriptAttribute

  case object checked extends FlagAttribute with InputAttribute

  case object cite extends Attribute[String] with QuoteAttribute

  case object cols extends Attribute[Int] with TextAreaAttribute

  case object colSpan extends Attribute[Int] with TableCellAttribute with TableColAttribute

  case object content extends Attribute[String] with MetaAttribute

  case object controls extends FlagAttribute with AudioAttribute with VideoAttribute

  case object coords extends Attribute[String] with AreaAttribute

  case object data extends Attribute[String] with ObjectAttribute

  case object defer extends FlagAttribute with ScriptAttribute

  case object dirName extends Attribute[String] with InputAttribute with TextAreaAttribute

  case object disabled extends FlagAttribute with ButtonAttribute with FieldSetAttribute
      with InputAttribute with OptGroupAttribute with OptionAttribute with SelectAttribute
      with TextAreaAttribute

  case object download extends Attribute[String] with AnchorAttribute with AreaAttribute

  case object encType extends Attribute[String] with FormAttribute

  case object `for` extends Attribute[String] with LabelAttribute

  case object form extends Attribute[String] with ButtonAttribute with FieldSetAttribute
      with InputAttribute with LabelAttribute with ObjectAttribute with SelectAttribute
      with TextAreaAttribute

  case object formAction extends Attribute[String] with ButtonAttribute with InputAttribute

  case object headers extends Attribute[String] with TableCellAttribute with TableColAttribute

  case object height extends Attribute[Int] with CanvasAttribute with EmbedAttribute
      with IFrameAttribute with ImageAttribute with InputAttribute with ObjectAttribute
      with VideoAttribute

  case object href extends Attribute[String] with AnchorAttribute with AreaAttribute
      with BaseAttribute with LinkAttribute

  case object hrefLang extends Attribute[String] with AnchorAttribute with AreaAttribute
      with LinkAttribute

  case object httpEquiv extends Attribute[String] with MetaAttribute

  case object isMap extends FlagAttribute with ImageAttribute

  case object kind extends Attribute[String] with TrackAttribute

  case object label extends Attribute[String] with TrackAttribute with OptionAttribute
      with OptGroupAttribute

  case object list extends Attribute[String] with InputAttribute

  case object loop extends FlagAttribute with AudioAttribute with VideoAttribute

  case object max extends Attribute[String] with InputAttribute with ProgressAttribute

  case object maxLength extends Attribute[Int] with InputAttribute with TextAreaAttribute

  case object media extends Attribute[String] with AnchorAttribute with AreaAttribute
      with LinkAttribute with SourceAttribute with StyleAttribute

  case object method extends Attribute[String] with FormAttribute

  case object min extends Attribute[String] with InputAttribute

  case object multiple extends FlagAttribute with InputAttribute with SelectAttribute

  case object muted extends FlagAttribute with VideoAttribute with AudioAttribute

  case object name extends Attribute[String] with ButtonAttribute with FieldSetAttribute
      with FormAttribute with IFrameAttribute with InputAttribute with MapAttribute
      with MetaAttribute with ObjectAttribute with ParamAttribute with SelectAttribute
      with TextAreaAttribute

  case object noValidate extends FlagAttribute with FormAttribute

  case object onAbort extends Attribute[UIEvent => IO[Unit]] with AudioAttribute with EmbedAttribute
      with ImageAttribute with ObjectAttribute with VideoAttribute

  case object onAfterPrint extends Attribute[Event => IO[Unit]] with BodyAttribute

  case object onBeforePrint extends Attribute[Event => IO[Unit]] with BodyAttribute

  case object onBeforeUnload extends Attribute[BeforeUnloadEvent => IO[Unit]] with BodyAttribute

  case object onBlur extends Attribute[FocusEvent => IO[Unit]] with VisibleElementAttribute

  case object onCanPlay extends Attribute[Event => IO[Unit]] with AudioAttribute with EmbedAttribute
      with ObjectAttribute with VideoAttribute

  case object onCanPlayThrough extends Attribute[Event => IO[Unit]] with AudioAttribute
      with VideoAttribute

  case object onChange extends Attribute[Event => IO[Unit]] with VisibleElementAttribute

  case object onClick extends Attribute[MouseEvent => IO[Unit]] with VisibleElementAttribute

  case object onContextMenu extends Attribute[MouseEvent => IO[Unit]] with VisibleElementAttribute

  case object onCopy extends Attribute[ClipboardEvent => IO[Unit]] with VisibleElementAttribute

  case object onCueChange extends Attribute[Event => IO[Unit]] with TrackAttribute

  case object onCut extends Attribute[ClipboardEvent => IO[Unit]] with VisibleElementAttribute

  case object onDoubleClick extends Attribute[MouseEvent => IO[Unit]] with VisibleElementAttribute

  case object onDrag extends Attribute[DragEvent => IO[Unit]] with VisibleElementAttribute

  case object onDragEnd extends Attribute[DragEvent => IO[Unit]] with VisibleElementAttribute

  case object onDragEnter extends Attribute[DragEvent => IO[Unit]] with VisibleElementAttribute

  case object onDragLeave extends Attribute[DragEvent => IO[Unit]] with VisibleElementAttribute

  case object onDragOver extends Attribute[DragEvent => IO[Unit]] with VisibleElementAttribute

  case object onDragStart extends Attribute[DragEvent => IO[Unit]] with VisibleElementAttribute

  case object onDrop extends Attribute[DragEvent => IO[Unit]] with VisibleElementAttribute

  case object onDurationChange extends Attribute[Event => IO[Unit]] with AudioAttribute
      with VideoAttribute

  case object onEmptied extends Attribute[Event => IO[Unit]] with AudioAttribute with VideoAttribute

  case object onEnded extends Attribute[Event => IO[Unit]] with AudioAttribute with VideoAttribute

  case object onError extends Attribute[ErrorEvent => IO[Unit]] with AudioAttribute
      with BodyAttribute with EmbedAttribute with ImageAttribute with ObjectAttribute
      with ScriptAttribute with StyleAttribute with VideoAttribute

  case object onFocus extends Attribute[FocusEvent => IO[Unit]] with VisibleElementAttribute

  case object onHashChange extends Attribute[Event => IO[Unit]] with BodyAttribute

  case object onInput extends Attribute[Event => IO[Unit]] with VisibleElementAttribute

  case object onKeyDown extends Attribute[KeyboardEvent => IO[Unit]] with VisibleElementAttribute

  case object onKeyPress extends Attribute[KeyboardEvent => IO[Unit]] with VisibleElementAttribute

  case object onKeyUp extends Attribute[KeyboardEvent => IO[Unit]] with VisibleElementAttribute

  case object onLoad extends Attribute[Event => IO[Unit]] with BodyAttribute with IFrameAttribute
      with ImageAttribute with InputAttribute with LinkAttribute with ScriptAttribute
      with StyleAttribute

  case object onLoadedData extends Attribute[Event => IO[Unit]] with AudioAttribute
      with VideoAttribute

  case object onLoadedMetaData extends Attribute[Event => IO[Unit]] with AudioAttribute
      with VideoAttribute

  case object onLoadStart extends Attribute[Event => IO[Unit]] with AudioAttribute
      with VideoAttribute

  case object onMouseDown extends Attribute[MouseEvent => IO[Unit]] with VisibleElementAttribute

  case object onMouseMove extends Attribute[MouseEvent => IO[Unit]] with VisibleElementAttribute

  case object onMouseOut extends Attribute[MouseEvent => IO[Unit]] with VisibleElementAttribute

  case object onMouseOver extends Attribute[MouseEvent => IO[Unit]] with VisibleElementAttribute

  case object onMouseUp extends Attribute[MouseEvent => IO[Unit]] with VisibleElementAttribute

  case object onMouseWheel extends Attribute[WheelEvent => IO[Unit]] with VisibleElementAttribute

  case object onOffline extends Attribute[Event => IO[Unit]] with BodyAttribute

  case object onOnline extends Attribute[Event => IO[Unit]] with BodyAttribute

  case object onPageHide extends Attribute[PageTransitionEvent => IO[Unit]] with BodyAttribute

  case object onPageShow extends Attribute[PageTransitionEvent => IO[Unit]] with BodyAttribute

  case object onPaste extends Attribute[ClipboardEvent => IO[Unit]] with VisibleElementAttribute

  case object onPause extends Attribute[Event => IO[Unit]] with AudioAttribute with VideoAttribute

  case object onPlay extends Attribute[Event => IO[Unit]] with AudioAttribute with VideoAttribute

  case object onPlaying extends Attribute[Event => IO[Unit]] with AudioAttribute with VideoAttribute

  case object onPopState extends Attribute[PopStateEvent => IO[Unit]] with BodyAttribute

  case object onRateChange extends Attribute[Event => IO[Unit]] with AudioAttribute
      with VideoAttribute

  case object onReset extends Attribute[Event => IO[Unit]] with FormAttribute

  case object onResize extends Attribute[UIEvent => IO[Unit]] with BodyAttribute

  case object onScroll extends Attribute[UIEvent => IO[Unit]] with VisibleElementAttribute

  case object onSeeked extends Attribute[Event => IO[Unit]] with AudioAttribute with VideoAttribute

  case object onSeeking extends Attribute[Event => IO[Unit]] with AudioAttribute with VideoAttribute

  case object onSelect extends Attribute[UIEvent => IO[Unit]] with VisibleElementAttribute

  case object onStalled extends Attribute[Event => IO[Unit]] with AudioAttribute with VideoAttribute

  case object onStorage extends Attribute[StorageEvent => IO[Unit]] with BodyAttribute

  case object onSubmit extends Attribute[Event => IO[Unit]] with FormAttribute

  case object onSuspend extends Attribute[Event => IO[Unit]] with AudioAttribute with VideoAttribute

  case object onTimeUpdate extends Attribute[Event => IO[Unit]] with AudioAttribute
      with VideoAttribute

  case object onUnload extends Attribute[Event => IO[Unit]] with BodyAttribute

  case object onVolumeChange extends Attribute[Event => IO[Unit]] with AudioAttribute
      with VideoAttribute

  case object onWaiting extends Attribute[Event => IO[Unit]] with AudioAttribute with VideoAttribute

  case object onWheel extends Attribute[MouseEvent => IO[Unit]] with AudioAttribute
      with VideoAttribute

  case object pattern extends Attribute[String] with InputAttribute

  case object placeholder extends Attribute[String] with InputAttribute with TextAreaAttribute

  case object poster extends Attribute[String] with VideoAttribute

  case object preload extends Attribute[String] with AudioAttribute with VideoAttribute

  case object readonly extends FlagAttribute with InputAttribute with TextAreaAttribute

  case object rel extends Attribute[String] with AnchorAttribute with AreaAttribute
      with FormAttribute with LinkAttribute

  case object required extends FlagAttribute with InputAttribute with SelectAttribute
      with TextAreaAttribute

  case object reversed extends FlagAttribute with OListAttribute

  case object rows extends Attribute[Int] with TextAreaAttribute

  case object rowSpan extends Attribute[Int] with TableCellAttribute with TableRowAttribute

  case object sandbox extends FlagAttribute with IFrameAttribute

  case object scope extends Attribute[String] with TableRowAttribute

  case object selected extends FlagAttribute with OptionAttribute

  case object shape extends Attribute[String] with AreaAttribute

  case object size extends Attribute[Int] with InputAttribute with SelectAttribute

  case object sizes extends Attribute[String] with ImageAttribute with LinkAttribute
      with SourceAttribute

  case object span extends Attribute[Int] with TableColAttribute with TableSectionAttribute

  case object src extends Attribute[String] with AudioAttribute with EmbedAttribute
      with IFrameAttribute with ImageAttribute with InputAttribute with ScriptAttribute
      with SourceAttribute with TrackAttribute with VideoAttribute

  case object srcDoc extends Attribute[String] with IFrameAttribute

  case object srcLang extends Attribute[String] with TrackAttribute

  case object srcSet extends Attribute[String] with ImageAttribute with SourceAttribute

  case object start extends Attribute[Int] with OListAttribute

  case object step extends Attribute[Int] with InputAttribute

  case object target extends Attribute[String] with AnchorAttribute with AreaAttribute
      with BaseAttribute with FormAttribute

  case object `type` extends Attribute[String] with AnchorAttribute with ButtonAttribute
      with EmbedAttribute with InputAttribute with LinkAttribute with MenuAttribute
      with ObjectAttribute with ScriptAttribute with SourceAttribute with StyleAttribute

  case object useMap extends Attribute[String] with ImageAttribute with ObjectAttribute

  case object value extends Attribute[String] with ButtonAttribute with InputAttribute
      with OptionAttribute with ParamAttribute

  case object width extends Attribute[Int] with CanvasAttribute with EmbedAttribute
      with IFrameAttribute with ImageAttribute with InputAttribute with ObjectAttribute
      with VideoAttribute

  case object wrap extends Attribute[String] with TextAreaAttribute

}
