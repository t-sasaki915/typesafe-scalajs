package net.st915.typesafescalajsdom.tags.visible

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.{TableSectionAttribute, VisibleElementAttribute}
import net.st915.typesafescalajsdom.tags.Tag

object TableSection {

  type AcceptAttribute = GlobalAttribute | TableSectionAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): TableSection =
    TableSection(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): TableSection =
    TableSection(attributes.toSet, childs.toList)

}

final case class TableSection(
  attributes: Set[(TableSection.AcceptAttribute, _)],
  childs: List[Node]
) extends Tag[TableSection.AcceptAttribute]
