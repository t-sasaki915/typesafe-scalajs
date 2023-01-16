package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.dom.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{TableRowAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object TableRow {

  type AcceptAttribute = GlobalAttribute | TableRowAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): TableRow =
    TableRow(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): TableRow =
    TableRow(attributes.toSet, childs.toList)

}

final case class TableRow(attributes: Set[(TableRow.AcceptAttribute, _)], childs: List[Node])
    extends Tag[TableRow.AcceptAttribute]