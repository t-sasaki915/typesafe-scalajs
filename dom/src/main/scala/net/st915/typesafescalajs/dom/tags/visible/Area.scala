package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{AreaAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object Area {

  type AcceptAttribute = GlobalAttribute | AreaAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Area =
    Area(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(children: Node*): Area =
    Area(attributes.toSet, children.toList)

}

final case class Area(attributes: Set[(Area.AcceptAttribute, _)], children: List[Node])
    extends Tag[Area.AcceptAttribute] {

  override val tagName: String = "area"

}
