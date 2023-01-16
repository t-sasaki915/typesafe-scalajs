package net.st915.typesafescalajsdom.tags

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.{DivAttribute, VisibleElementAttribute}

object Div {

  type AcceptAttribute = GlobalAttribute | DivAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Div =
    Div(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Div =
    Div(attributes.toSet, childs.toList)

}

final case class Div(attributes: Set[(Div.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Div.AcceptAttribute]
