package net.st915.typesafescalajsdom.tags.visible

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.{TableColAttribute, VisibleElementAttribute}
import net.st915.typesafescalajsdom.tags.Tag

object TableCol {

  type AcceptAttribute = GlobalAttribute | TableColAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): TableCol =
    TableCol(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): TableCol =
    TableCol(attributes.toSet, childs.toList)

}

final case class TableCol(attributes: Set[(TableCol.AcceptAttribute, _)], childs: List[Node])
    extends Tag[TableCol.AcceptAttribute]
