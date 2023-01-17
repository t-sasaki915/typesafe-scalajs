package net.st915.typesafescalajs.dom.tags.special

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.HeadAttribute
import net.st915.typesafescalajs.dom.tags.Tag

object Head {

  type AcceptAttribute = GlobalAttribute | HeadAttribute

  def apply(attributes: (AcceptAttribute, _)*): Head =
    Head(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Head =
    Head(attributes.toSet, childs.toList)

}

final case class Head(attributes: Set[(Head.AcceptAttribute, _)], childs: List[Node])
