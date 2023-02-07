package net.st915.typesafescalajs.dom.tags.invisible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.LinkAttribute
import net.st915.typesafescalajs.dom.tags.Tag

object Link {

  type AcceptAttribute = GlobalAttribute | LinkAttribute

  def apply(attributes: (AcceptAttribute, _)*): Link =
    Link(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(children: Node*): Link =
    Link(attributes.toSet, children.toList)

}

final case class Link(attributes: Set[(Link.AcceptAttribute, _)], children: List[Node])
    extends Tag[Link.AcceptAttribute] {

  override val tagName: String = "link"

}
