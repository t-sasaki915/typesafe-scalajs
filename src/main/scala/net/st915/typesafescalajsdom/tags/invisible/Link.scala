package net.st915.typesafescalajsdom.tags.invisible

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.LinkAttribute
import net.st915.typesafescalajsdom.tags.Tag

object Link {

  type AcceptAttribute = GlobalAttribute | LinkAttribute

  def apply(attributes: (AcceptAttribute, _)*): Link =
    Link(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Link =
    Link(attributes.toSet, childs.toList)

}

final case class Link(attributes: Set[(Link.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Link.AcceptAttribute]
