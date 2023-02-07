package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{TableColAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object TableCol {

  type AcceptAttribute = GlobalAttribute | TableColAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): TableCol =
    TableCol(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(children: Node*): TableCol =
    TableCol(attributes.toSet, children.toList)

}

final case class TableCol(attributes: Set[(TableCol.AcceptAttribute, _)], children: List[Node])
    extends Tag[TableCol.AcceptAttribute] {

  override val tagName: String = "col"

}
