package net.st915.typesafescalajsdom.tags.visible

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.{ParagraphAttribute, VisibleElementAttribute}
import net.st915.typesafescalajsdom.tags.Tag

object Paragraph {

  type AcceptAttribute = GlobalAttribute | ParagraphAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Paragraph =
    Paragraph(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Paragraph =
    Paragraph(attributes.toSet, childs.toList)

}

final case class Paragraph(attributes: Set[(Paragraph.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Paragraph.AcceptAttribute]
