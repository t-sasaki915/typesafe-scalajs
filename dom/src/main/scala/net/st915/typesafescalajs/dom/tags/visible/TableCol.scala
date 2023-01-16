package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{TableColAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object TableCol {

  type AcceptAttribute = GlobalAttribute | TableColAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): TableCol =
    TableCol(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): TableCol =
    TableCol(attributes.toSet, childs.toList)

}

final case class TableCol(attributes: Set[(TableCol.AcceptAttribute, _)], childs: List[Node])
    extends Tag[TableCol.AcceptAttribute]
