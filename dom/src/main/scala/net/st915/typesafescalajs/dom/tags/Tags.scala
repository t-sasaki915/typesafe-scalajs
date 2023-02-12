package net.st915.typesafescalajs.dom.tags

import net.st915.typesafescalajs.Node

object Tags {

  case class Anchor(attributes: Set[(AcceptAttributes.Anchor, _)], children: List[Node])
      extends Tag[AcceptAttributes.Anchor]:
    override val tagName: String = "a"

  case class Area(attributes: Set[(AcceptAttributes.Area, _)], children: List[Node])
      extends Tag[AcceptAttributes.Area]:
    override val tagName: String = "area"

  case class Audio(attributes: Set[(AcceptAttributes.Audio, _)], children: List[Node])
      extends Tag[AcceptAttributes.Audio]:
    override val tagName: String = "audio"

  case class BR(attributes: Set[(AcceptAttributes.BR, _)], children: List[Node])
      extends Tag[AcceptAttributes.BR]:
    override val tagName: String = "br"

  case class Base(attributes: Set[(AcceptAttributes.Base, _)], children: List[Node])
      extends Tag[AcceptAttributes.Base]:
    override val tagName: String = "base"

  case class Button(attributes: Set[(AcceptAttributes.Button, _)], children: List[Node])
      extends Tag[AcceptAttributes.Button]:
    override val tagName: String = "button"

  case class Canvas(attributes: Set[(AcceptAttributes.Canvas, _)], children: List[Node])
      extends Tag[AcceptAttributes.Canvas]:
    override val tagName: String = "canvas"

  case class Dialog(attributes: Set[(AcceptAttributes.Dialog, _)], children: List[Node])
      extends Tag[AcceptAttributes.Dialog]:
    override val tagName: String = "dialog"

  case class Div(attributes: Set[(AcceptAttributes.Div, _)], children: List[Node])
      extends Tag[AcceptAttributes.Div]:
    override val tagName: String = "div"

  case class Embed(attributes: Set[(AcceptAttributes.Embed, _)], children: List[Node])
      extends Tag[AcceptAttributes.Embed]:
    override val tagName: String = "embed"

  case class FieldSet(attributes: Set[(AcceptAttributes.FieldSet, _)], children: List[Node])
      extends Tag[AcceptAttributes.FieldSet]:
    override val tagName: String = "fieldset"

  case class Form(attributes: Set[(AcceptAttributes.Form, _)], children: List[Node])
      extends Tag[AcceptAttributes.Form]:
    override val tagName: String = "form"

  case class H1(attributes: Set[(AcceptAttributes.H1, _)], children: List[Node])
      extends Tag[AcceptAttributes.H1]:
    override val tagName: String = "h1"

  case class H2(attributes: Set[(AcceptAttributes.H2, _)], children: List[Node])
      extends Tag[AcceptAttributes.H2]:
    override val tagName: String = "h2"

  case class H3(attributes: Set[(AcceptAttributes.H3, _)], children: List[Node])
      extends Tag[AcceptAttributes.H3]:
    override val tagName: String = "h3"

  case class H4(attributes: Set[(AcceptAttributes.H4, _)], children: List[Node])
      extends Tag[AcceptAttributes.H4]:
    override val tagName: String = "h4"

  case class H5(attributes: Set[(AcceptAttributes.H5, _)], children: List[Node])
      extends Tag[AcceptAttributes.H5]:
    override val tagName: String = "h5"

  case class H6(attributes: Set[(AcceptAttributes.H6, _)], children: List[Node])
      extends Tag[AcceptAttributes.H6]:
    override val tagName: String = "h6"

  case class HR(attributes: Set[(AcceptAttributes.HR, _)], children: List[Node])
      extends Tag[AcceptAttributes.HR]:
    override val tagName: String = "hr"

  case class HTMLMap(attributes: Set[(AcceptAttributes.HTMLMap, _)], children: List[Node])
      extends Tag[AcceptAttributes.HTMLMap]:
    override val tagName: String = "map"

  case class HTMLObject(attributes: Set[(AcceptAttributes.HTMLObject, _)],
                              children: List[Node]
  ) extends Tag[AcceptAttributes.HTMLObject]:
    override val tagName: String = "object"

  case class HTMLOption(attributes: Set[(AcceptAttributes.HTMLOption, _)],
                              children: List[Node]
  ) extends Tag[AcceptAttributes.HTMLOption]:
    override val tagName: String = "option"

  case class IFrame(attributes: Set[(AcceptAttributes.IFrame, _)], children: List[Node])
      extends Tag[AcceptAttributes.IFrame]:
    override val tagName: String = "iframe"

  case class Image(attributes: Set[(AcceptAttributes.Image, _)], children: List[Node])
      extends Tag[AcceptAttributes.Image]:
    override val tagName: String = "img"

  case class Input(attributes: Set[(AcceptAttributes.Input, _)], children: List[Node])
      extends Tag[AcceptAttributes.Input]:
    override val tagName: String = "input"

  case class Label(attributes: Set[(AcceptAttributes.Label, _)], children: List[Node])
      extends Tag[AcceptAttributes.Label]:
    override val tagName: String = "label"

  case class Legend(attributes: Set[(AcceptAttributes.Legend, _)], children: List[Node])
      extends Tag[AcceptAttributes.Legend]:
    override val tagName: String = "legend"

  case class Link(attributes: Set[(AcceptAttributes.Link, _)], children: List[Node])
      extends Tag[AcceptAttributes.Link]:
    override val tagName: String = "link"

  case class LI(attributes: Set[(AcceptAttributes.LI, _)], children: List[Node])
      extends Tag[AcceptAttributes.LI]:
    override val tagName: String = "li"

  case class Menu(attributes: Set[(AcceptAttributes.Menu, _)], children: List[Node])
      extends Tag[AcceptAttributes.Menu]:
    override val tagName: String = "menu"

  case class Meta(attributes: Set[(AcceptAttributes.Meta, _)], children: List[Node])
      extends Tag[AcceptAttributes.Meta]:
    override val tagName: String = "meta"

  case class OList(attributes: Set[(AcceptAttributes.OList, _)], children: List[Node])
      extends Tag[AcceptAttributes.OList]:
    override val tagName: String = "ol"

  case class OptGroup(attributes: Set[(AcceptAttributes.OptGroup, _)], children: List[Node])
      extends Tag[AcceptAttributes.OptGroup]:
    override val tagName: String = "optgroup"

  case class Paragraph(attributes: Set[(AcceptAttributes.Paragraph, _)], children: List[Node])
      extends Tag[AcceptAttributes.Paragraph]:
    override val tagName: String = "p"

  case class Param(attributes: Set[(AcceptAttributes.Param, _)], children: List[Node])
      extends Tag[AcceptAttributes.Param]:
    override val tagName: String = "param"

  case class Pre(attributes: Set[(AcceptAttributes.Pre, _)], children: List[Node])
      extends Tag[AcceptAttributes.Pre]:
    override val tagName: String = "pre"

  case class Progress(attributes: Set[(AcceptAttributes.Progress, _)], children: List[Node])
      extends Tag[AcceptAttributes.Progress]:
    override val tagName: String = "progress"

  case class Quote(attributes: Set[(AcceptAttributes.Quote, _)], children: List[Node])
      extends Tag[AcceptAttributes.Quote]:
    override val tagName: String = "blockquote"

  case class Script(attributes: Set[(AcceptAttributes.Script, _)], children: List[Node])
      extends Tag[AcceptAttributes.Script]:
    override val tagName: String = "script"

  case class Select(attributes: Set[(AcceptAttributes.Select, _)], children: List[Node])
      extends Tag[AcceptAttributes.Select]:
    override val tagName: String = "select"

  case class Source(attributes: Set[(AcceptAttributes.Source, _)], children: List[Node])
      extends Tag[AcceptAttributes.Source]:
    override val tagName: String = "source"

  case class Span(attributes: Set[(AcceptAttributes.Span, _)], children: List[Node])
      extends Tag[AcceptAttributes.Span]:
    override val tagName: String = "span"

  case class Style(attributes: Set[(AcceptAttributes.Style, _)], children: List[Node])
      extends Tag[AcceptAttributes.Style]:
    override val tagName: String = "style"

  case class Table(attributes: Set[(AcceptAttributes.Table, _)], children: List[Node])
      extends Tag[AcceptAttributes.Table]:
    override val tagName: String = "table"

  case class TableCaption(attributes: Set[(AcceptAttributes.TableCaption, _)],
                                children: List[Node]
  ) extends Tag[AcceptAttributes.TableCaption]:
    override val tagName: String = "caption"

  case class TableCell(attributes: Set[(AcceptAttributes.TableCell, _)], children: List[Node])
      extends Tag[AcceptAttributes.TableCell]:
    override val tagName: String = "td"

  case class TableCol(attributes: Set[(AcceptAttributes.TableCol, _)], children: List[Node])
      extends Tag[AcceptAttributes.TableCol]:
    override val tagName: String = "col"

  case class TableRow(attributes: Set[(AcceptAttributes.TableRow, _)], children: List[Node])
      extends Tag[AcceptAttributes.TableRow]:
    override val tagName: String = "tr"

  case class TableSection(attributes: Set[(AcceptAttributes.TableSection, _)],
                                children: List[Node]
  ) extends Tag[AcceptAttributes.TableSection]:
    override val tagName: String = "th"

  case class TextArea(attributes: Set[(AcceptAttributes.TextArea, _)], children: List[Node])
      extends Tag[AcceptAttributes.TextArea]:
    override val tagName: String = "textarea"

  case class Title(attributes: Set[(AcceptAttributes.Title, _)], children: List[Node])
      extends Tag[AcceptAttributes.Title]:
    override val tagName: String = "title"

  case class Track(attributes: Set[(AcceptAttributes.Track, _)], children: List[Node])
      extends Tag[AcceptAttributes.Track]:
    override val tagName: String = "track"

  case class Video(attributes: Set[(AcceptAttributes.Video, _)], children: List[Node])
      extends Tag[AcceptAttributes.Video]:
    override val tagName: String = "video"

  case class Body(attributes: Set[(AcceptAttributes.Body, _)], children: List[Node])

  case class Head(attributes: Set[(AcceptAttributes.Head, _)], children: List[Node])

}
