package net.st915.typesafescalajs.dom.tags

import net.st915.typesafescalajs.Node

trait all {

  private def applyMacro[A, B](f: (Set[(A, _)], List[Node]) => B)(values: Seq[(A, _) | Node]): B =
    values.headOption match
      case Some(_: (A, _)) => f(values.map(_.asInstanceOf[(A, _)]).toSet, Nil)
      case Some(_: Node)   => f(Set(), values.map(_.asInstanceOf[Node]).toList)
      case None            => f(Set(), Nil)

  opaque type Anchor = Tags.Anchor
  object Anchor:
    def apply(attrs: (AcceptAttributes.Anchor, _)*)(children: Node*): Anchor =
      Tags.Anchor(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Anchor, _) | Node)*): Anchor =
      applyMacro(Tags.Anchor.apply)(values)

  opaque type Area = Tags.Area
  object Area:
    def apply(attrs: (AcceptAttributes.Area, _)*)(children: Node*): Area =
      Tags.Area(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Area, _) | Node)*): Area =
      applyMacro(Tags.Area.apply)(values)

  opaque type Audio = Tags.Audio
  object Audio:
    def apply(attrs: (AcceptAttributes.Audio, _)*)(children: Node*): Audio =
      Tags.Audio(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Audio, _) | Node)*): Audio =
      applyMacro(Tags.Audio.apply)(values)

  opaque type BR = Tags.BR
  object BR:
    def apply(attrs: (AcceptAttributes.BR, _)*)(children: Node*): BR =
      Tags.BR(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.BR, _) | Node)*): BR =
      applyMacro(Tags.BR.apply)(values)

  opaque type Base = Tags.Base
  object Base:
    def apply(attrs: (AcceptAttributes.Base, _)*)(children: Node*): Base =
      Tags.Base(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Base, _) | Node)*): Base =
      applyMacro(Tags.Base.apply)(values)

  opaque type Button = Tags.Button
  object Button:
    def apply(attrs: (AcceptAttributes.Button, _)*)(children: Node*): Button =
      Tags.Button(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Button, _) | Node)*): Button =
      applyMacro(Tags.Button.apply)(values)

  opaque type Canvas = Tags.Canvas
  object Canvas:
    def apply(attrs: (AcceptAttributes.Canvas, _)*)(children: Node*): Canvas =
      Tags.Canvas(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Canvas, _) | Node)*): Canvas =
      applyMacro(Tags.Canvas.apply)(values)

  opaque type Dialog = Tags.Dialog
  object Dialog:
    def apply(attrs: (AcceptAttributes.Dialog, _)*)(children: Node*): Dialog =
      Tags.Dialog(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Dialog, _) | Node)*): Dialog =
      applyMacro(Tags.Dialog.apply)(values)

  opaque type Div = Tags.Div
  object Div:
    def apply(attrs: (AcceptAttributes.Div, _)*)(children: Node*): Div =
      Tags.Div(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Div, _) | Node)*): Div =
      applyMacro(Tags.Div.apply)(values)

  opaque type Embed = Tags.Embed
  object Embed:
    def apply(attrs: (AcceptAttributes.Embed, _)*)(children: Node*): Embed =
      Tags.Embed(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Embed, _) | Node)*): Embed =
      applyMacro(Tags.Embed.apply)(values)

  opaque type FieldSet = Tags.FieldSet
  object FieldSet:
    def apply(attrs: (AcceptAttributes.FieldSet, _)*)(children: Node*): FieldSet =
      Tags.FieldSet(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.FieldSet, _) | Node)*): FieldSet =
      applyMacro(Tags.FieldSet.apply)(values)

  opaque type Form = Tags.Form
  object Form:
    def apply(attrs: (AcceptAttributes.Form, _)*)(children: Node*): Form =
      Tags.Form(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Form, _) | Node)*): Form =
      applyMacro(Tags.Form.apply)(values)

  opaque type H1 = Tags.H1
  object H1:
    def apply(attrs: (AcceptAttributes.H1, _)*)(children: Node*): H1 =
      Tags.H1(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.H1, _) | Node)*): H1 =
      applyMacro(Tags.H1.apply)(values)

  opaque type H2 = Tags.H2
  object H2:
    def apply(attrs: (AcceptAttributes.H2, _)*)(children: Node*): H2 =
      Tags.H2(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.H2, _) | Node)*): H2 =
      applyMacro(Tags.H2.apply)(values)

  opaque type H3 = Tags.H3
  object H3:
    def apply(attrs: (AcceptAttributes.H3, _)*)(children: Node*): H3 =
      Tags.H3(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.H3, _) | Node)*): H3 =
      applyMacro(Tags.H3.apply)(values)

  opaque type H4 = Tags.H4
  object H4:
    def apply(attrs: (AcceptAttributes.H4, _)*)(children: Node*): H4 =
      Tags.H4(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.H4, _) | Node)*): H4 =
      applyMacro(Tags.H4.apply)(values)

  opaque type H5 = Tags.H5
  object H5:
    def apply(attrs: (AcceptAttributes.H5, _)*)(children: Node*): H5 =
      Tags.H5(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.H5, _) | Node)*): H5 =
      applyMacro(Tags.H5.apply)(values)

  opaque type H6 = Tags.H6
  object H6:
    def apply(attrs: (AcceptAttributes.H6, _)*)(children: Node*): H6 =
      Tags.H6(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.H6, _) | Node)*): H6 =
      applyMacro(Tags.H6.apply)(values)

  opaque type HR = Tags.HR
  object HR:
    def apply(attrs: (AcceptAttributes.HR, _)*)(children: Node*): HR =
      Tags.HR(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.HR, _) | Node)*): HR =
      applyMacro(Tags.HR.apply)(values)

  opaque type HTMLMap = Tags.HTMLMap
  object HTMLMap:
    def apply(attrs: (AcceptAttributes.HTMLMap, _)*)(children: Node*): HTMLMap =
      Tags.HTMLMap(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.HTMLMap, _) | Node)*): HTMLMap =
      applyMacro(Tags.HTMLMap.apply)(values)

  opaque type HTMLObject = Tags.HTMLObject
  object HTMLObject:
    def apply(attrs: (AcceptAttributes.HTMLObject, _)*)(children: Node*): HTMLObject =
      Tags.HTMLObject(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.HTMLObject, _) | Node)*): HTMLObject =
      applyMacro(Tags.HTMLObject.apply)(values)

  opaque type HTMLOption = Tags.HTMLOption
  object HTMLOption:
    def apply(attrs: (AcceptAttributes.HTMLOption, _)*)(children: Node*): HTMLOption =
      Tags.HTMLOption(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.HTMLOption, _) | Node)*): HTMLOption =
      applyMacro(Tags.HTMLOption.apply)(values)

  opaque type IFrame = Tags.IFrame
  object IFrame:
    def apply(attrs: (AcceptAttributes.IFrame, _)*)(children: Node*): IFrame =
      Tags.IFrame(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.IFrame, _) | Node)*): IFrame =
      applyMacro(Tags.IFrame.apply)(values)

  opaque type Image = Tags.Image
  object Image:
    def apply(attrs: (AcceptAttributes.Image, _)*)(children: Node*): Image =
      Tags.Image(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Image, _) | Node)*): Image =
      applyMacro(Tags.Image.apply)(values)

  opaque type Input = Tags.Input
  object Input:
    def apply(attrs: (AcceptAttributes.Input, _)*)(children: Node*): Input =
      Tags.Input(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Input, _) | Node)*): Input =
      applyMacro(Tags.Input.apply)(values)

  opaque type Label = Tags.Label
  object Label:
    def apply(attrs: (AcceptAttributes.Label, _)*)(children: Node*): Label =
      Tags.Label(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Label, _) | Node)*): Label =
      applyMacro(Tags.Label.apply)(values)

  opaque type Legend = Tags.Legend
  object Legend:
    def apply(attrs: (AcceptAttributes.Legend, _)*)(children: Node*): Legend =
      Tags.Legend(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Legend, _) | Node)*): Legend =
      applyMacro(Tags.Legend.apply)(values)

  opaque type Link = Tags.Link
  object Link:
    def apply(attrs: (AcceptAttributes.Link, _)*)(children: Node*): Link =
      Tags.Link(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Link, _) | Node)*): Link =
      applyMacro(Tags.Link.apply)(values)

  opaque type LI = Tags.LI
  object LI:
    def apply(attrs: (AcceptAttributes.LI, _)*)(children: Node*): LI =
      Tags.LI(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.LI, _) | Node)*): LI =
      applyMacro(Tags.LI.apply)(values)

  opaque type Menu = Tags.Menu
  object Menu:
    def apply(attrs: (AcceptAttributes.Menu, _)*)(children: Node*): Menu =
      Tags.Menu(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Menu, _) | Node)*): Menu =
      applyMacro(Tags.Menu.apply)(values)

  opaque type Meta = Tags.Meta
  object Meta:
    def apply(attrs: (AcceptAttributes.Meta, _)*)(children: Node*): Meta =
      Tags.Meta(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Meta, _) | Node)*): Meta =
      applyMacro(Tags.Meta.apply)(values)

  opaque type OList = Tags.OList
  object OList:
    def apply(attrs: (AcceptAttributes.OList, _)*)(children: Node*): OList =
      Tags.OList(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.OList, _) | Node)*): OList =
      applyMacro(Tags.OList.apply)(values)

  opaque type OptGroup = Tags.OptGroup
  object OptGroup:
    def apply(attrs: (AcceptAttributes.OptGroup, _)*)(children: Node*): OptGroup =
      Tags.OptGroup(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.OptGroup, _) | Node)*): OptGroup =
      applyMacro(Tags.OptGroup.apply)(values)

  opaque type Paragraph = Tags.Paragraph
  object Paragraph:
    def apply(attrs: (AcceptAttributes.Paragraph, _)*)(children: Node*): Paragraph =
      Tags.Paragraph(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Paragraph, _) | Node)*): Paragraph =
      applyMacro(Tags.Paragraph.apply)(values)

  opaque type Param = Tags.Param
  object Param:
    def apply(attrs: (AcceptAttributes.Param, _)*)(children: Node*): Param =
      Tags.Param(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Param, _) | Node)*): Param =
      applyMacro(Tags.Param.apply)(values)

  opaque type Pre = Tags.Pre
  object Pre:
    def apply(attrs: (AcceptAttributes.Pre, _)*)(children: Node*): Pre =
      Tags.Pre(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Pre, _) | Node)*): Pre =
      applyMacro(Tags.Pre.apply)(values)

  opaque type Progress = Tags.Progress
  object Progress:
    def apply(attrs: (AcceptAttributes.Progress, _)*)(children: Node*): Progress =
      Tags.Progress(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Progress, _) | Node)*): Progress =
      applyMacro(Tags.Progress.apply)(values)

  opaque type Quote = Tags.Quote
  object Quote:
    def apply(attrs: (AcceptAttributes.Quote, _)*)(children: Node*): Quote =
      Tags.Quote(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Quote, _) | Node)*): Quote =
      applyMacro(Tags.Quote.apply)(values)

  opaque type Script = Tags.Script
  object Script:
    def apply(attrs: (AcceptAttributes.Script, _)*)(children: Node*): Script =
      Tags.Script(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Script, _) | Node)*): Script =
      applyMacro(Tags.Script.apply)(values)

  opaque type Select = Tags.Select
  object Select:
    def apply(attrs: (AcceptAttributes.Select, _)*)(children: Node*): Select =
      Tags.Select(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Select, _) | Node)*): Select =
      applyMacro(Tags.Select.apply)(values)

  opaque type Source = Tags.Source
  object Source:
    def apply(attrs: (AcceptAttributes.Source, _)*)(children: Node*): Source =
      Tags.Source(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Source, _) | Node)*): Source =
      applyMacro(Tags.Source.apply)(values)

  opaque type Span = Tags.Span
  object Span:
    def apply(attrs: (AcceptAttributes.Span, _)*)(children: Node*): Span =
      Tags.Span(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Span, _) | Node)*): Span =
      applyMacro(Tags.Span.apply)(values)

  opaque type Style = Tags.Style
  object Style:
    def apply(attrs: (AcceptAttributes.Style, _)*)(children: Node*): Style =
      Tags.Style(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Style, _) | Node)*): Style =
      applyMacro(Tags.Style.apply)(values)

  opaque type Table = Tags.Table
  object Table:
    def apply(attrs: (AcceptAttributes.Table, _)*)(children: Node*): Table =
      Tags.Table(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Table, _) | Node)*): Table =
      applyMacro(Tags.Table.apply)(values)

  opaque type TableCaption = Tags.TableCaption
  object TableCaption:
    def apply(attrs: (AcceptAttributes.TableCaption, _)*)(children: Node*): TableCaption =
      Tags.TableCaption(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.TableCaption, _) | Node)*): TableCaption =
      applyMacro(Tags.TableCaption.apply)(values)

  opaque type TableCell = Tags.TableCell
  object TableCell:
    def apply(attrs: (AcceptAttributes.TableCell, _)*)(children: Node*): TableCell =
      Tags.TableCell(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.TableCell, _) | Node)*): TableCell =
      applyMacro(Tags.TableCell.apply)(values)

  opaque type TableCol = Tags.TableCol
  object TableCol:
    def apply(attrs: (AcceptAttributes.TableCol, _)*)(children: Node*): TableCol =
      Tags.TableCol(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.TableCol, _) | Node)*): TableCol =
      applyMacro(Tags.TableCol.apply)(values)

  opaque type TableRow = Tags.TableRow
  object TableRow:
    def apply(attrs: (AcceptAttributes.TableRow, _)*)(children: Node*): TableRow =
      Tags.TableRow(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.TableRow, _) | Node)*): TableRow =
      applyMacro(Tags.TableRow.apply)(values)

  opaque type TableSection = Tags.TableSection
  object TableSection:
    def apply(attrs: (AcceptAttributes.TableSection, _)*)(children: Node*): TableSection =
      Tags.TableSection(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.TableSection, _) | Node)*): TableSection =
      applyMacro(Tags.TableSection.apply)(values)

  opaque type TextArea = Tags.TextArea
  object TextArea:
    def apply(attrs: (AcceptAttributes.TextArea, _)*)(children: Node*): TextArea =
      Tags.TextArea(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.TextArea, _) | Node)*): TextArea =
      applyMacro(Tags.TextArea.apply)(values)

  opaque type Title = Tags.Title
  object Title:
    def apply(attrs: (AcceptAttributes.Title, _)*)(children: Node*): Title =
      Tags.Title(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Title, _) | Node)*): Title =
      applyMacro(Tags.Title.apply)(values)

  opaque type Track = Tags.Track
  object Track:
    def apply(attrs: (AcceptAttributes.Track, _)*)(children: Node*): Track =
      Tags.Track(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Track, _) | Node)*): Track =
      applyMacro(Tags.Track.apply)(values)

  opaque type Video = Tags.Video
  object Video:
    def apply(attrs: (AcceptAttributes.Video, _)*)(children: Node*): Video =
      Tags.Video(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Video, _) | Node)*): Video =
      applyMacro(Tags.Video.apply)(values)

  opaque type Body = Tags.Body
  object Body:
    def apply(attrs: (AcceptAttributes.Body, _)*)(children: Node*): Body =
      Tags.Body(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Body, _) | Node)*): Body =
      applyMacro(Tags.Body.apply)(values)

  opaque type Head = Tags.Head
  object Head:
    def apply(attrs: (AcceptAttributes.Head, _)*)(children: Node*): Head =
      Tags.Head(attrs.toSet, children.toList)
    def apply(values: ((AcceptAttributes.Head, _) | Node)*): Head =
      applyMacro(Tags.Head.apply)(values)

}

object all extends all
