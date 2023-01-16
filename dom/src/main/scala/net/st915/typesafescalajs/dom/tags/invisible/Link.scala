package net.st915.typesafescalajs.dom.tags.invisible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.LinkAttribute
import net.st915.typesafescalajs.dom.tags.Tag

object Link {

  type AcceptAttribute = GlobalAttribute | LinkAttribute

  def apply(attributes: (AcceptAttribute, _)*): Link =
    Link(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Link =
    Link(attributes.toSet, childs.toList)

}

final case class Link(attributes: Set[(Link.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Link.AcceptAttribute]
