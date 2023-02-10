package net.st915.typesafescalajs.dom.tags

import net.st915.typesafescalajs.Node

object SimpleTags {

  case class SimpleAnchor(attributes: Set[(AcceptAttributes.Anchor, _)], children: List[Node])
      extends Tag[AcceptAttributes.Anchor]:
    override val tagName: String = "a"

  case class SimpleArea(attributes: Set[(AcceptAttributes.Area, _)], children: List[Node])
      extends Tag[AcceptAttributes.Area]:
    override val tagName: String = "area"

  case class SimpleAudio(attributes: Set[(AcceptAttributes.Audio, _)], children: List[Node])
      extends Tag[AcceptAttributes.Audio]:
    override val tagName: String = "audio"

  case class SimpleBR(attributes: Set[(AcceptAttributes.BR, _)], children: List[Node])
      extends Tag[AcceptAttributes.BR]:
    override val tagName: String = "br"

  case class SimpleBase(attributes: Set[(AcceptAttributes.Base, _)], children: List[Node])
      extends Tag[AcceptAttributes.Base]:
    override val tagName: String = "base"

  case class SimpleButton(attributes: Set[(AcceptAttributes.Button, _)], children: List[Node])
      extends Tag[AcceptAttributes.Button]:
    override val tagName: String = "button"

  case class SimpleCanvas(attributes: Set[(AcceptAttributes.Canvas, _)], children: List[Node])
      extends Tag[AcceptAttributes.Canvas]:
    override val tagName: String = "canvas"

  case class SimpleDialog(attributes: Set[(AcceptAttributes.Dialog, _)], children: List[Node])
      extends Tag[AcceptAttributes.Dialog]:
    override val tagName: String = "dialog"

  case class SimpleDiv(attributes: Set[(AcceptAttributes.Div, _)], children: List[Node])
      extends Tag[AcceptAttributes.Div]:
    override val tagName: String = "div"

  case class SimpleEmbed(attributes: Set[(AcceptAttributes.Embed, _)], children: List[Node])
      extends Tag[AcceptAttributes.Embed]:
    override val tagName: String = "embed"

  case class SimpleFieldSet(attributes: Set[(AcceptAttributes.FieldSet, _)], children: List[Node])
      extends Tag[AcceptAttributes.FieldSet]:
    override val tagName: String = "fieldset"

  case class SimpleForm(attributes: Set[(AcceptAttributes.Form, _)], children: List[Node])
      extends Tag[AcceptAttributes.Form]:
    override val tagName: String = "form"

  case class SimpleH1(attributes: Set[(AcceptAttributes.H1, _)], children: List[Node])
      extends Tag[AcceptAttributes.H1]:
    override val tagName: String = "h1"

  case class SimpleH2(attributes: Set[(AcceptAttributes.H2, _)], children: List[Node])
      extends Tag[AcceptAttributes.H2]:
    override val tagName: String = "h2"

}
