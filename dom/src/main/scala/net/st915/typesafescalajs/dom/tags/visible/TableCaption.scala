package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{
  TableCaptionAttribute,
  VisibleElementAttribute
}
import net.st915.typesafescalajs.dom.tags.Tag

object TableCaption {

  type AcceptAttribute = GlobalAttribute | TableCaptionAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): TableCaption =
    TableCaption(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(children: Node*): TableCaption =
    TableCaption(attributes.toSet, children.toList)

}

final case class TableCaption(
  attributes: Set[(TableCaption.AcceptAttribute, _)],
  children: List[Node]
) extends Tag[TableCaption.AcceptAttribute]
