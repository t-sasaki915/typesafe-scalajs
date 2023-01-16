package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{MapAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object HTMLMap {

  type AcceptAttribute = GlobalAttribute | MapAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): HTMLMap =
    HTMLMap(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): HTMLMap =
    HTMLMap(attributes.toSet, childs.toList)

}

final case class HTMLMap(attributes: Set[(HTMLMap.AcceptAttribute, _)], childs: List[Node])
    extends Tag[HTMLMap.AcceptAttribute]
