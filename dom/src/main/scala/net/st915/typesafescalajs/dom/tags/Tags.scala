package net.st915.typesafescalajs.dom.tags

import net.st915.typesafescalajs.Node

object Tags {

  private def applyMacro[A, B](f: (Set[(A, _)], List[Node]) => B)(values: Seq[(A, _) | Node]): B =
    values.headOption match
      case Some(_: (A, _)) => f(values.map(_.asInstanceOf[(A, _)]).toSet, Nil)
      case Some(_: Node)   => f(Set(), values.map(_.asInstanceOf[Node]).toList)
      case None            => f(Set(), Nil)

  object Anchor:
    def apply(attrs: (AcceptAttributes.Anchor, _)*)(children: Node*): Anchor =
      Anchor(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Anchor, _) | Node)*): Anchor =
      applyMacro(Anchor.apply)(values)
  final case class Anchor(attributes: Set[(AcceptAttributes.Anchor, _)], children: List[Node])
      extends Tag[AcceptAttributes.Anchor]:
    override val tagName: String = "a"

  object Area:
    def apply(attrs: (AcceptAttributes.Area, _)*)(children: Node*): Area =
      Area(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Area, _) | Node)*): Area =
      applyMacro(Area.apply)(values)
  final case class Area(attributes: Set[(AcceptAttributes.Area, _)], children: List[Node])
      extends Tag[AcceptAttributes.Area]:
    override val tagName: String = "area"

  object Audio:
    def apply(attrs: (AcceptAttributes.Audio, _)*)(children: Node*): Audio =
      Audio(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Audio, _) | Node)*): Audio =
      applyMacro(Audio.apply)(values)
  final case class Audio(attributes: Set[(AcceptAttributes.Audio, _)], children: List[Node])
      extends Tag[AcceptAttributes.Audio]:
    override val tagName: String = "audio"

  object BR:
    def apply(attrs: (AcceptAttributes.BR, _)*)(children: Node*): BR =
      BR(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.BR, _) | Node)*): BR =
      applyMacro(BR.apply)(values)
  final case class BR(attributes: Set[(AcceptAttributes.BR, _)], children: List[Node])
      extends Tag[AcceptAttributes.BR]:
    override val tagName: String = "br"

  object Base:
    def apply(attrs: (AcceptAttributes.Base, _)*)(children: Node*): Base =
      Base(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Base, _) | Node)*): Base =
      applyMacro(Base.apply)(values)
  final case class Base(attributes: Set[(AcceptAttributes.Base, _)], children: List[Node])
      extends Tag[AcceptAttributes.Base]:
    override val tagName: String = "base"

  object Button:
    def apply(attrs: (AcceptAttributes.Button, _)*)(children: Node*): Button =
      Button(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Button, _) | Node)*): Button =
      applyMacro(Button.apply)(values)
  final case class Button(attributes: Set[(AcceptAttributes.Button, _)], children: List[Node])
      extends Tag[AcceptAttributes.Button]:
    override val tagName: String = "button"

  object Canvas:
    def apply(attrs: (AcceptAttributes.Canvas, _)*)(children: Node*): Canvas =
      Canvas(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Canvas, _) | Node)*): Canvas =
      applyMacro(Canvas.apply)(values)
  final case class Canvas(attributes: Set[(AcceptAttributes.Canvas, _)], children: List[Node])
      extends Tag[AcceptAttributes.Canvas]:
    override val tagName: String = "canvas"

  object Dialog:
    def apply(attrs: (AcceptAttributes.Dialog, _)*)(children: Node*): Dialog =
      Dialog(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Dialog, _) | Node)*): Dialog =
      applyMacro(Dialog.apply)(values)
  final case class Dialog(attributes: Set[(AcceptAttributes.Dialog, _)], children: List[Node])
      extends Tag[AcceptAttributes.Dialog]:
    override val tagName: String = "dialog"

  object Div:
    def apply(attrs: (AcceptAttributes.Div, _)*)(children: Node*): Div =
      Div(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Div, _) | Node)*): Div =
      applyMacro(Div.apply)(values)
  final case class Div(attributes: Set[(AcceptAttributes.Div, _)], children: List[Node])
      extends Tag[AcceptAttributes.Div]:
    override val tagName: String = "div"

  object Embed:
    def apply(attrs: (AcceptAttributes.Embed, _)*)(children: Node*): Embed =
      Embed(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Embed, _) | Node)*): Embed =
      applyMacro(Embed.apply)(values)
  final case class Embed(attributes: Set[(AcceptAttributes.Embed, _)], children: List[Node])
      extends Tag[AcceptAttributes.Embed]:
    override val tagName: String = "embed"

  object FieldSet:
    def apply(attrs: (AcceptAttributes.FieldSet, _)*)(children: Node*): FieldSet =
      FieldSet(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.FieldSet, _) | Node)*): FieldSet =
      applyMacro(FieldSet.apply)(values)
  final case class FieldSet(attributes: Set[(AcceptAttributes.FieldSet, _)], children: List[Node])
      extends Tag[AcceptAttributes.FieldSet]:
    override val tagName: String = "fieldset"

  object Form:
    def apply(attrs: (AcceptAttributes.Form, _)*)(children: Node*): Form =
      Form(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Form, _) | Node)*): Form =
      applyMacro(Form.apply)(values)
  final case class Form(attributes: Set[(AcceptAttributes.Form, _)], children: List[Node])
      extends Tag[AcceptAttributes.Form]:
    override val tagName: String = "form"

  object H1:
    def apply(attrs: (AcceptAttributes.H1, _)*)(children: Node*): H1 =
      H1(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.H1, _) | Node)*): H1 =
      applyMacro(H1.apply)(values)
  final case class H1(attributes: Set[(AcceptAttributes.H1, _)], children: List[Node])
      extends Tag[AcceptAttributes.H1]:
    override val tagName: String = "h1"

  object H2:
    def apply(attrs: (AcceptAttributes.H2, _)*)(children: Node*): H2 =
      H2(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.H2, _) | Node)*): H2 =
      applyMacro(H2.apply)(values)
  final case class H2(attributes: Set[(AcceptAttributes.H2, _)], children: List[Node])
      extends Tag[AcceptAttributes.H2]:
    override val tagName: String = "h2"

  object H3:
    def apply(attrs: (AcceptAttributes.H3, _)*)(children: Node*): H3 =
      H3(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.H3, _) | Node)*): H3 =
      applyMacro(H3.apply)(values)
  final case class H3(attributes: Set[(AcceptAttributes.H3, _)], children: List[Node])
      extends Tag[AcceptAttributes.H3]:
    override val tagName: String = "h3"

  object H4:
    def apply(attrs: (AcceptAttributes.H4, _)*)(children: Node*): H4 =
      H4(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.H4, _) | Node)*): H4 =
      applyMacro(H4.apply)(values)
  final case class H4(attributes: Set[(AcceptAttributes.H4, _)], children: List[Node])
      extends Tag[AcceptAttributes.H4]:
    override val tagName: String = "h4"

  object H5:
    def apply(attrs: (AcceptAttributes.H5, _)*)(children: Node*): H5 =
      H5(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.H5, _) | Node)*): H5 =
      applyMacro(H5.apply)(values)
  final case class H5(attributes: Set[(AcceptAttributes.H5, _)], children: List[Node])
      extends Tag[AcceptAttributes.H5]:
    override val tagName: String = "h5"

  object H6:
    def apply(attrs: (AcceptAttributes.H6, _)*)(children: Node*): H6 =
      H6(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.H6, _) | Node)*): H6 =
      applyMacro(H6.apply)(values)
  final case class H6(attributes: Set[(AcceptAttributes.H6, _)], children: List[Node])
      extends Tag[AcceptAttributes.H6]:
    override val tagName: String = "h6"

  object HR:
    def apply(attrs: (AcceptAttributes.HR, _)*)(children: Node*): HR =
      HR(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.HR, _) | Node)*): HR =
      applyMacro(HR.apply)(values)
  final case class HR(attributes: Set[(AcceptAttributes.HR, _)], children: List[Node])
      extends Tag[AcceptAttributes.HR]:
    override val tagName: String = "hr"

  object HTMLMap:
    def apply(attrs: (AcceptAttributes.HTMLMap, _)*)(children: Node*): HTMLMap =
      HTMLMap(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.HTMLMap, _) | Node)*): HTMLMap =
      applyMacro(HTMLMap.apply)(values)
  final case class HTMLMap(attributes: Set[(AcceptAttributes.HTMLMap, _)], children: List[Node])
      extends Tag[AcceptAttributes.HTMLMap]:
    override val tagName: String = "map"

  object HTMLObject:
    def apply(attrs: (AcceptAttributes.HTMLObject, _)*)(children: Node*): HTMLObject =
      HTMLObject(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.HTMLObject, _) | Node)*): HTMLObject =
      applyMacro(HTMLObject.apply)(values)
  final case class HTMLObject(attributes: Set[(AcceptAttributes.HTMLObject, _)],
                              children: List[Node]
  ) extends Tag[AcceptAttributes.HTMLObject]:
    override val tagName: String = "object"

  object HTMLOption:
    def apply(attrs: (AcceptAttributes.HTMLOption, _)*)(children: Node*): HTMLOption =
      HTMLOption(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.HTMLOption, _) | Node)*): HTMLOption =
      applyMacro(HTMLOption.apply)(values)
  final case class HTMLOption(attributes: Set[(AcceptAttributes.HTMLOption, _)],
                              children: List[Node]
  ) extends Tag[AcceptAttributes.HTMLOption]:
    override val tagName: String = "option"

  object IFrame:
    def apply(attrs: (AcceptAttributes.IFrame, _)*)(children: Node*): IFrame =
      IFrame(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.IFrame, _) | Node)*): IFrame =
      applyMacro(IFrame.apply)(values)
  final case class IFrame(attributes: Set[(AcceptAttributes.IFrame, _)], children: List[Node])
      extends Tag[AcceptAttributes.IFrame]:
    override val tagName: String = "iframe"

  object Image:
    def apply(attrs: (AcceptAttributes.Image, _)*)(children: Node*): Image =
      Image(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Image, _) | Node)*): Image =
      applyMacro(Image.apply)(values)
  final case class Image(attributes: Set[(AcceptAttributes.Image, _)], children: List[Node])
      extends Tag[AcceptAttributes.Image]:
    override val tagName: String = "img"

  object Input:
    def apply(attrs: (AcceptAttributes.Input, _)*)(children: Node*): Input =
      Input(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Input, _) | Node)*): Input =
      applyMacro(Input.apply)(values)
  final case class Input(attributes: Set[(AcceptAttributes.Input, _)], children: List[Node])
      extends Tag[AcceptAttributes.Input]:
    override val tagName: String = "input"

  object Label:
    def apply(attrs: (AcceptAttributes.Label, _)*)(children: Node*): Label =
      Label(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Label, _) | Node)*): Label =
      applyMacro(Label.apply)(values)
  final case class Label(attributes: Set[(AcceptAttributes.Label, _)], children: List[Node])
      extends Tag[AcceptAttributes.Label]:
    override val tagName: String = "label"

  object Legend:
    def apply(attrs: (AcceptAttributes.Legend, _)*)(children: Node*): Legend =
      Legend(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Legend, _) | Node)*): Legend =
      applyMacro(Legend.apply)(values)
  final case class Legend(attributes: Set[(AcceptAttributes.Legend, _)], children: List[Node])
      extends Tag[AcceptAttributes.Legend]:
    override val tagName: String = "legend"

  object Link:
    def apply(attrs: (AcceptAttributes.Link, _)*)(children: Node*): Link =
      Link(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Link, _) | Node)*): Link =
      applyMacro(Link.apply)(values)
  final case class Link(attributes: Set[(AcceptAttributes.Link, _)], children: List[Node])
      extends Tag[AcceptAttributes.Link]:
    override val tagName: String = "link"

  object LI:
    def apply(attrs: (AcceptAttributes.LI, _)*)(children: Node*): LI =
      LI(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.LI, _) | Node)*): LI =
      applyMacro(LI.apply)(values)
  final case class LI(attributes: Set[(AcceptAttributes.LI, _)], children: List[Node])
      extends Tag[AcceptAttributes.LI]:
    override val tagName: String = "li"

  object Menu:
    def apply(attrs: (AcceptAttributes.Menu, _)*)(children: Node*): Menu =
      Menu(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Menu, _) | Node)*): Menu =
      applyMacro(Menu.apply)(values)
  final case class Menu(attributes: Set[(AcceptAttributes.Menu, _)], children: List[Node])
      extends Tag[AcceptAttributes.Menu]:
    override val tagName: String = "menu"

  object Meta:
    def apply(attrs: (AcceptAttributes.Meta, _)*)(children: Node*): Meta =
      Meta(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Meta, _) | Node)*): Meta =
      applyMacro(Meta.apply)(values)
  final case class Meta(attributes: Set[(AcceptAttributes.Meta, _)], children: List[Node])
      extends Tag[AcceptAttributes.Meta]:
    override val tagName: String = "meta"

  object OList:
    def apply(attrs: (AcceptAttributes.OList, _)*)(children: Node*): OList =
      OList(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.OList, _) | Node)*): OList =
      applyMacro(OList.apply)(values)
  final case class OList(attributes: Set[(AcceptAttributes.OList, _)], children: List[Node])
      extends Tag[AcceptAttributes.OList]:
    override val tagName: String = "ol"

  object OptGroup:
    def apply(attrs: (AcceptAttributes.OptGroup, _)*)(children: Node*): OptGroup =
      OptGroup(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.OptGroup, _) | Node)*): OptGroup =
      applyMacro(OptGroup.apply)(values)
  final case class OptGroup(attributes: Set[(AcceptAttributes.OptGroup, _)], children: List[Node])
      extends Tag[AcceptAttributes.OptGroup]:
    override val tagName: String = "optgroup"

  object Paragraph:
    def apply(attrs: (AcceptAttributes.Paragraph, _)*)(children: Node*): Paragraph =
      Paragraph(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Paragraph, _) | Node)*): Paragraph =
      applyMacro(Paragraph.apply)(values)
  final case class Paragraph(attributes: Set[(AcceptAttributes.Paragraph, _)], children: List[Node])
      extends Tag[AcceptAttributes.Paragraph]:
    override val tagName: String = "p"

  object Param:
    def apply(attrs: (AcceptAttributes.Param, _)*)(children: Node*): Param =
      Param(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Param, _) | Node)*): Param =
      applyMacro(Param.apply)(values)
  final case class Param(attributes: Set[(AcceptAttributes.Param, _)], children: List[Node])
      extends Tag[AcceptAttributes.Param]:
    override val tagName: String = "param"

  object Pre:
    def apply(attrs: (AcceptAttributes.Pre, _)*)(children: Node*): Pre =
      Pre(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Pre, _) | Node)*): Pre =
      applyMacro(Pre.apply)(values)
  final case class Pre(attributes: Set[(AcceptAttributes.Pre, _)], children: List[Node])
      extends Tag[AcceptAttributes.Pre]:
    override val tagName: String = "pre"

  object Progress:
    def apply(attrs: (AcceptAttributes.Progress, _)*)(children: Node*): Progress =
      Progress(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Progress, _) | Node)*): Progress =
      applyMacro(Progress.apply)(values)
  final case class Progress(attributes: Set[(AcceptAttributes.Progress, _)], children: List[Node])
      extends Tag[AcceptAttributes.Progress]:
    override val tagName: String = "progress"

  object Quote:
    def apply(attrs: (AcceptAttributes.Quote, _)*)(children: Node*): Quote =
      Quote(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Quote, _) | Node)*): Quote =
      applyMacro(Quote.apply)(values)
  final case class Quote(attributes: Set[(AcceptAttributes.Quote, _)], children: List[Node])
      extends Tag[AcceptAttributes.Quote]:
    override val tagName: String = "blockquote"

  object Script:
    def apply(attrs: (AcceptAttributes.Script, _)*)(children: Node*): Script =
      Script(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Script, _) | Node)*): Script =
      applyMacro(Script.apply)(values)
  final case class Script(attributes: Set[(AcceptAttributes.Script, _)], children: List[Node])
      extends Tag[AcceptAttributes.Script]:
    override val tagName: String = "script"

  object Select:
    def apply(attrs: (AcceptAttributes.Select, _)*)(children: Node*): Select =
      Select(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Select, _) | Node)*): Select =
      applyMacro(Select.apply)(values)
  final case class Select(attributes: Set[(AcceptAttributes.Select, _)], children: List[Node])
      extends Tag[AcceptAttributes.Select]:
    override val tagName: String = "select"

  object Source:
    def apply(attrs: (AcceptAttributes.Source, _)*)(children: Node*): Source =
      Source(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Source, _) | Node)*): Source =
      applyMacro(Source.apply)(values)
  final case class Source(attributes: Set[(AcceptAttributes.Source, _)], children: List[Node])
      extends Tag[AcceptAttributes.Source]:
    override val tagName: String = "source"

  object Span:
    def apply(attrs: (AcceptAttributes.Span, _)*)(children: Node*): Span =
      Span(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Span, _) | Node)*): Span =
      applyMacro(Span.apply)(values)
  final case class Span(attributes: Set[(AcceptAttributes.Span, _)], children: List[Node])
      extends Tag[AcceptAttributes.Span]:
    override val tagName: String = "span"

  object Style:
    def apply(attrs: (AcceptAttributes.Style, _)*)(children: Node*): Style =
      Style(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Style, _) | Node)*): Style =
      applyMacro(Style.apply)(values)
  final case class Style(attributes: Set[(AcceptAttributes.Style, _)], children: List[Node])
      extends Tag[AcceptAttributes.Style]:
    override val tagName: String = "style"

  object Table:
    def apply(attrs: (AcceptAttributes.Table, _)*)(children: Node*): Table =
      Table(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Table, _) | Node)*): Table =
      applyMacro(Table.apply)(values)
  final case class Table(attributes: Set[(AcceptAttributes.Table, _)], children: List[Node])
      extends Tag[AcceptAttributes.Table]:
    override val tagName: String = "table"

  object TableCaption:
    def apply(attrs: (AcceptAttributes.TableCaption, _)*)(children: Node*): TableCaption =
      TableCaption(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.TableCaption, _) | Node)*): TableCaption =
      applyMacro(TableCaption.apply)(values)
  final case class TableCaption(attributes: Set[(AcceptAttributes.TableCaption, _)],
                                children: List[Node]
  ) extends Tag[AcceptAttributes.TableCaption]:
    override val tagName: String = "caption"

  object TableCell:
    def apply(attrs: (AcceptAttributes.TableCell, _)*)(children: Node*): TableCell =
      TableCell(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.TableCell, _) | Node)*): TableCell =
      applyMacro(TableCell.apply)(values)
  final case class TableCell(attributes: Set[(AcceptAttributes.TableCell, _)], children: List[Node])
      extends Tag[AcceptAttributes.TableCell]:
    override val tagName: String = "td"

  object TableCol:
    def apply(attrs: (AcceptAttributes.TableCol, _)*)(children: Node*): TableCol =
      TableCol(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.TableCol, _) | Node)*): TableCol =
      applyMacro(TableCol.apply)(values)
  final case class TableCol(attributes: Set[(AcceptAttributes.TableCol, _)], children: List[Node])
      extends Tag[AcceptAttributes.TableCol]:
    override val tagName: String = "col"

  object TableRow:
    def apply(attrs: (AcceptAttributes.TableRow, _)*)(children: Node*): TableRow =
      TableRow(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.TableRow, _) | Node)*): TableRow =
      applyMacro(TableRow.apply)(values)
  final case class TableRow(attributes: Set[(AcceptAttributes.TableRow, _)], children: List[Node])
      extends Tag[AcceptAttributes.TableRow]:
    override val tagName: String = "tr"

  object TableSection:
    def apply(attrs: (AcceptAttributes.TableSection, _)*)(children: Node*): TableSection =
      TableSection(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.TableSection, _) | Node)*): TableSection =
      applyMacro(TableSection.apply)(values)
  final case class TableSection(attributes: Set[(AcceptAttributes.TableSection, _)],
                                children: List[Node]
  ) extends Tag[AcceptAttributes.TableSection]:
    override val tagName: String = "th"

  object TextArea:
    def apply(attrs: (AcceptAttributes.TextArea, _)*)(children: Node*): TextArea =
      TextArea(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.TextArea, _) | Node)*): TextArea =
      applyMacro(TextArea.apply)(values)
  final case class TextArea(attributes: Set[(AcceptAttributes.TextArea, _)], children: List[Node])
      extends Tag[AcceptAttributes.TextArea]:
    override val tagName: String = "textarea"

  object Title:
    def apply(attrs: (AcceptAttributes.Title, _)*)(children: Node*): Title =
      Title(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Title, _) | Node)*): Title =
      applyMacro(Title.apply)(values)
  final case class Title(attributes: Set[(AcceptAttributes.Title, _)], children: List[Node])
      extends Tag[AcceptAttributes.Title]:
    override val tagName: String = "title"

  object Track:
    def apply(attrs: (AcceptAttributes.Track, _)*)(children: Node*): Track =
      Track(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Track, _) | Node)*): Track =
      applyMacro(Track.apply)(values)
  final case class Track(attributes: Set[(AcceptAttributes.Track, _)], children: List[Node])
      extends Tag[AcceptAttributes.Track]:
    override val tagName: String = "track"

  object Video:
    def apply(attrs: (AcceptAttributes.Video, _)*)(children: Node*): Video =
      Video(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Video, _) | Node)*): Video =
      applyMacro(Video.apply)(values)
  final case class Video(attributes: Set[(AcceptAttributes.Video, _)], children: List[Node])
      extends Tag[AcceptAttributes.Video]:
    override val tagName: String = "video"

  object Body:
    def apply(attrs: (AcceptAttributes.Body, _)*)(children: Node*): Body =
      Body(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Body, _) | Node)*): Body =
      applyMacro(Body.apply)(values)
  final case class Body(attributes: Set[(AcceptAttributes.Body, _)], children: List[Node])

  object Head:
    def apply(attrs: (AcceptAttributes.Head, _)*)(children: Node*): Head =
      Head(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Head, _) | Node)*): Head =
      applyMacro(Head.apply)(values)
  final case class Head(attributes: Set[(AcceptAttributes.Head, _)], children: List[Node])

}
