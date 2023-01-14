package net.st915.typesafescalajsdom.tags

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.BaseAttribute

object Base {

  type AcceptAttribute = GlobalAttribute | BaseAttribute

  def apply(attributes: (AcceptAttribute, _)*): Base =
    Base(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Base =
    Base(attributes.toSet, childs.toList)

}

final case class Base(attributes: Set[(Base.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Base.AcceptAttribute]
