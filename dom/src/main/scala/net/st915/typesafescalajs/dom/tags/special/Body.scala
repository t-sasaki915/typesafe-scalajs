package net.st915.typesafescalajs.dom.tags.special

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{BodyAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object Body {

  type AcceptAttribute = GlobalAttribute | BodyAttribute | VisibleElementAttribute

  def apply(children: Node*): Body =
    Body(Set(), children.toList)

  def apply(attributes: (AcceptAttribute, _)*)(children: Node*): Body =
    Body(attributes.toSet, children.toList)

}

final case class Body(attributes: Set[(Body.AcceptAttribute, _)], children: List[Node])
