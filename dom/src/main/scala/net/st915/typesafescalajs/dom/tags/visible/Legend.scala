package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{LegendAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object Legend {

  type AcceptAttribute = GlobalAttribute | LegendAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Legend =
    Legend(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(children: Node*): Legend =
    Legend(attributes.toSet, children.toList)

}

final case class Legend(attributes: Set[(Legend.AcceptAttribute, _)], children: List[Node])
    extends Tag[Legend.AcceptAttribute] {

  override val tagName: String = "legend"

}
