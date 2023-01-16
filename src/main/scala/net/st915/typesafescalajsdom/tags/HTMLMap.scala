package net.st915.typesafescalajsdom.tags

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.{MapAttribute, VisibleElementAttribute}

object HTMLMap {

  type AcceptAttribute = GlobalAttribute | MapAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): HTMLMap =
    HTMLMap(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): HTMLMap =
    HTMLMap(attributes.toSet, childs.toList)

}

final case class HTMLMap(attributes: Set[(HTMLMap.AcceptAttribute, _)], childs: List[Node])
    extends Tag[HTMLMap.AcceptAttribute]
