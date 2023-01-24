package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{SelectAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object Select {

  type AcceptAttribute = GlobalAttribute | SelectAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Select =
    Select(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(children: Node*): Select =
    Select(attributes.toSet, children.toList)

}

final case class Select(attributes: Set[(Select.AcceptAttribute, _)], children: List[Node])
    extends Tag[Select.AcceptAttribute]
