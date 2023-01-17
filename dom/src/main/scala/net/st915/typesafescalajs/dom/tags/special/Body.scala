package net.st915.typesafescalajs.dom.tags.special

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{BodyAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object Body {

  type AcceptAttribute = GlobalAttribute | BodyAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Body =
    Body(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Body =
    Body(attributes.toSet, childs.toList)

}

final case class Body(attributes: Set[(Body.AcceptAttribute, _)], childs: List[Node])
