package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.dom.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{DivAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object Div {

  type AcceptAttribute = GlobalAttribute | DivAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Div =
    Div(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Div =
    Div(attributes.toSet, childs.toList)

}

final case class Div(attributes: Set[(Div.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Div.AcceptAttribute]
