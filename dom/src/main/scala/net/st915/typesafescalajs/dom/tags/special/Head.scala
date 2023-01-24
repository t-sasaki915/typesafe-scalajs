package net.st915.typesafescalajs.dom.tags.special

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.HeadAttribute
import net.st915.typesafescalajs.dom.tags.Tag

object Head {

  type AcceptAttribute = GlobalAttribute | HeadAttribute

  def apply(children: Node*): Head =
    Head(Set(), children.toList)

  def apply(attributes: (AcceptAttribute, _)*)(children: Node*): Head =
    Head(attributes.toSet, children.toList)

}

final case class Head(attributes: Set[(Head.AcceptAttribute, _)], children: List[Node])
