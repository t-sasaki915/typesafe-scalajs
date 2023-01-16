package net.st915.typesafescalajsdom.tags.special

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.HeadAttribute
import net.st915.typesafescalajsdom.tags.Tag

object Head {

  type AcceptAttribute = GlobalAttribute | HeadAttribute

  def apply(attributes: (AcceptAttribute, _)*): Head =
    Head(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Head =
    Head(attributes.toSet, childs.toList)

}

final case class Head(attributes: Set[(Head.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Head.AcceptAttribute]
