package net.st915.typesafescalajsdom.tags

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.{SelectAttribute, VisibleElementAttribute}

object Select {

  type AcceptAttribute = GlobalAttribute | SelectAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Select =
    Select(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Select =
    Select(attributes.toSet, childs.toList)

}

final case class Select(attributes: Set[(Select.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Select.AcceptAttribute]
