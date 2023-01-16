package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.dom.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{SelectAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object Select {

  type AcceptAttribute = GlobalAttribute | SelectAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Select =
    Select(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Select =
    Select(attributes.toSet, childs.toList)

}

final case class Select(attributes: Set[(Select.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Select.AcceptAttribute]
