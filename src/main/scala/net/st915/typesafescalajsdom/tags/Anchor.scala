package net.st915.typesafescalajsdom.tags

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute

object Anchor {

  def apply(attributes: (GlobalAttribute, _)*): Anchor =
    Anchor(attributes.toList, List())

  def apply(attributes: (GlobalAttribute, _)*)(childs: Node*): Anchor =
    Anchor(attributes.toList, childs.toList)

}

final case class Anchor(attributes: List[(GlobalAttribute, _)], childs: List[Node]) extends Node
