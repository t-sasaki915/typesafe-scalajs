package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{MapAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object HTMLMap {

  type AcceptAttribute = GlobalAttribute | MapAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): HTMLMap =
    HTMLMap(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(children: Node*): HTMLMap =
    HTMLMap(attributes.toSet, children.toList)

}

final case class HTMLMap(attributes: Set[(HTMLMap.AcceptAttribute, _)], children: List[Node])
    extends Tag[HTMLMap.AcceptAttribute] {

  override val tagName: String = "map"

}
