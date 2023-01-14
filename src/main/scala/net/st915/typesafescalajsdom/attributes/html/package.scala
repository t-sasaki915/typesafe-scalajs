package net.st915.typesafescalajsdom.attributes

import net.st915.typesafescalajsdom.attributes.Attribute

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

  object accept extends Attribute[String] with InputAttribute:
    override def default: String = ""

  object acceptCharset extends Attribute[String] with FormAttribute:
    override def default: String = ""

  object action extends Attribute[String] with FormAttribute:
    override def default: String = ""

  object alt extends Attribute[String] with AreaAttribute with ImageAttribute with InputAttribute:
    override def default: String = ""

  // TODO: async, autocomplete, autofocus, autoplay

  object charset extends Attribute[String] with MetaAttribute with ScriptAttribute:
    override def default: String = ""

  // TODO: checked

  object cite extends Attribute[String] with QuoteAttribute:
    override def default: String = ""

  object cols extends Attribute[Int] with TextAreaAttribute:
    override def default: Int = 0

  object colSpan extends Attribute[Int] with TableCellAttribute with TableColAttribute:
    override def default: Int = 0

  object content extends Attribute[String] with MetaAttribute:
    override def default: String = ""

  // TODO: controls

  object coords extends Attribute[String] with AreaAttribute:
    override def default: String = ""

  object data extends Attribute[String] with ObjectAttribute:
    override def default: String = ""

  // TODO: defer

  object dirName extends Attribute[String] with InputAttribute with TextAreaAttribute:
    override def default: String = ""

}
