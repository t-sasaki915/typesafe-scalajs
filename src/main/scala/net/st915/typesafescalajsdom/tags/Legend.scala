package net.st915.typesafescalajsdom.tags

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.{LegendAttribute, VisibleElementAttribute}

object Legend {

  type AcceptAttribute = GlobalAttribute | LegendAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Legend =
    Legend(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Legend =
    Legend(attributes.toSet, childs.toList)

}

final case class Legend(attributes: Set[(Legend.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Legend.AcceptAttribute]
