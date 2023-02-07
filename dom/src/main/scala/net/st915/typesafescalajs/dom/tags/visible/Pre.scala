package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{PreAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object Pre {

  type AcceptAttribute = GlobalAttribute | PreAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Pre =
    Pre(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(children: Node*): Pre =
    Pre(attributes.toSet, children.toList)

}

final case class Pre(attributes: Set[(Pre.AcceptAttribute, _)], children: List[Node])
    extends Tag[Pre.AcceptAttribute] {

  override val tagName: String = "pre"

}
