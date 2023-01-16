package net.st915.typesafescalajsdom.tags.visible

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.{TableCellAttribute, VisibleElementAttribute}
import net.st915.typesafescalajsdom.tags.Tag

object TableCell {

  type AcceptAttribute = GlobalAttribute | TableCellAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): TableCell =
    TableCell(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): TableCell =
    TableCell(attributes.toSet, childs.toList)

}

final case class TableCell(attributes: Set[(TableCell.AcceptAttribute, _)], childs: List[Node])
    extends Tag[TableCell.AcceptAttribute]
