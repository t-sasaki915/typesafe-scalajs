package net.st915.typesafescalajsdom.tags

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.MetaAttribute

object Meta {

  type AcceptAttribute = GlobalAttribute | MetaAttribute

  def apply(attributes: (AcceptAttribute, _)*): Meta =
    Meta(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Meta =
    Meta(attributes.toSet, childs.toList)

}

final case class Meta(attributes: Set[(Meta.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Meta.AcceptAttribute]
