package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{DivAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object Div {

  type AcceptAttribute = GlobalAttribute | DivAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Div =
    Div(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(children: Node*): Div =
    Div(attributes.toSet, children.toList)

}

final case class Div(attributes: Set[(Div.AcceptAttribute, _)], children: List[Node])
    extends Tag[Div.AcceptAttribute] {

  override val tagName: String = "div"
  
}
