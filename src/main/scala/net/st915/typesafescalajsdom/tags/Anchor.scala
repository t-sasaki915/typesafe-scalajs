package net.st915.typesafescalajsdom.tags

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.{AnchorAttribute, VisibleElementAttribute}

object Anchor {

  type AcceptAttribute = GlobalAttribute | AnchorAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Anchor =
    Anchor(attributes.toSet, List())

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Anchor =
    Anchor(attributes.toSet, childs.toList)

}

final case class Anchor(attributes: Set[(Anchor.AcceptAttribute, _)], childs: List[Node])
    extends Node
