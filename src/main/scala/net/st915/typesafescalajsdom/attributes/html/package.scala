package net.st915.typesafescalajsdom.attributes

import net.st915.typesafescalajsdom.attributes.{Attribute, FlagAttribute}

/**
 * *
 * @see
 *   https://www.w3schools.com/tags/ref_attributes.asp
 */
package object html {

  sealed trait VisibleElementAttribute
  sealed trait AnchorAttribute extends VisibleElementAttribute
  sealed trait AreaAttribute extends VisibleElementAttribute
  sealed trait AudioAttribute
  sealed trait BRAttribute extends VisibleElementAttribute
  sealed trait BaseAttribute
  sealed trait BodyAttribute extends VisibleElementAttribute
  sealed trait ButtonAttribute extends VisibleElementAttribute
  sealed trait CanvasAttribute extends VisibleElementAttribute
  sealed trait DialogAttribute extends VisibleElementAttribute
  sealed trait DivAttribute extends VisibleElementAttribute
  sealed trait EmbedAttribute extends VisibleElementAttribute
  sealed trait FieldSetAttribute extends VisibleElementAttribute
  sealed trait FormAttribute extends VisibleElementAttribute
  sealed trait HRAttribute extends VisibleElementAttribute
  sealed trait HeadAttribute
  sealed trait HTMLAttribute
  sealed trait IFrameAttribute extends VisibleElementAttribute
  sealed trait ImageAttribute extends VisibleElementAttribute
  sealed trait InputAttribute extends VisibleElementAttribute
  sealed trait LinkAttribute extends VisibleElementAttribute
  sealed trait LIAttribute extends VisibleElementAttribute
  sealed trait LabelAttribute extends VisibleElementAttribute
  sealed trait LegendAttribute extends VisibleElementAttribute
  sealed trait MapAttribute extends VisibleElementAttribute
  sealed trait MediaAttribute
  sealed trait MenuAttribute extends VisibleElementAttribute
  sealed trait MetaAttribute
  sealed trait OListAttribute extends VisibleElementAttribute
  sealed trait ObjectAttribute extends VisibleElementAttribute
  sealed trait OptGroupAttribute extends VisibleElementAttribute
  sealed trait OptionAttribute extends VisibleElementAttribute
  sealed trait ParagraphAttribute extends VisibleElementAttribute
  sealed trait ParamAttribute
  sealed trait PreAttribute extends VisibleElementAttribute
  sealed trait ProgressAttribute extends VisibleElementAttribute
  sealed trait QuoteAttribute extends VisibleElementAttribute
  sealed trait ScriptAttribute
  sealed trait SelectAttribute extends VisibleElementAttribute
  sealed trait SourceAttribute
  sealed trait SpanAttribute extends VisibleElementAttribute
  sealed trait StyleAttribute
  sealed trait TableCaptionAttribute extends VisibleElementAttribute
  sealed trait TableCellAttribute extends VisibleElementAttribute
  sealed trait TableColAttribute extends VisibleElementAttribute
  sealed trait TableRowAttribute extends VisibleElementAttribute
  sealed trait TableSectionAttribute extends VisibleElementAttribute
  sealed trait TemplateAttribute extends VisibleElementAttribute
  sealed trait TextAreaAttribute extends VisibleElementAttribute
  sealed trait TitleAttribute
  sealed trait TrackAttribute
  sealed trait VideoAttribute extends VisibleElementAttribute

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

}
