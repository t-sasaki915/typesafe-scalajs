package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{ParagraphAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object Paragraph {

  type AcceptAttribute = GlobalAttribute | ParagraphAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Paragraph =
    Paragraph(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(children: Node*): Paragraph =
    Paragraph(attributes.toSet, children.toList)

}

final case class Paragraph(attributes: Set[(Paragraph.AcceptAttribute, _)], children: List[Node])
    extends Tag[Paragraph.AcceptAttribute] {

  override val tagName: String = "p"

}
