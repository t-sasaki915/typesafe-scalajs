package net.st915.typesafescalajs.dom.tags.invisible

import net.st915.typesafescalajs.dom.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.MetaAttribute
import net.st915.typesafescalajs.dom.tags.Tag

object Meta {

  type AcceptAttribute = GlobalAttribute | MetaAttribute

  def apply(attributes: (AcceptAttribute, _)*): Meta =
    Meta(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Meta =
    Meta(attributes.toSet, childs.toList)

}

final case class Meta(attributes: Set[(Meta.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Meta.AcceptAttribute]
