package net.st915.typesafescalajsdom.tags

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.AnchorAttribute

object Anchor {

  def apply(attributes: (GlobalAttribute | AnchorAttribute, _)*): Anchor =
    Anchor(attributes.toList, List())

  def apply(attributes: (GlobalAttribute | AnchorAttribute, _)*)(childs: Node*): Anchor =
    Anchor(attributes.toList, childs.toList)

}

final case class Anchor(attributes: List[(GlobalAttribute | AnchorAttribute, _)], childs: List[Node]) extends Node
