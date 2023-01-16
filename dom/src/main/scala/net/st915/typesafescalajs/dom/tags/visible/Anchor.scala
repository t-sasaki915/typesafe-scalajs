package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.dom.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{AnchorAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object Anchor {

  type AcceptAttribute = GlobalAttribute | AnchorAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Anchor =
    Anchor(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Anchor =
    Anchor(attributes.toSet, childs.toList)

}

final case class Anchor(attributes: Set[(Anchor.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Anchor.AcceptAttribute]
