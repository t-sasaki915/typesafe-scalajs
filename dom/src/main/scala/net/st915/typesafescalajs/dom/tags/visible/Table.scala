package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{TableAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object Table {

  type AcceptAttribute = GlobalAttribute | TableAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Table =
    Table(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Table =
    Table(attributes.toSet, childs.toList)

}

final case class Table(attributes: Set[(Table.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Table.AcceptAttribute]
