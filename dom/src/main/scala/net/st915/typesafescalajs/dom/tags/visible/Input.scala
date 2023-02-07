package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{InputAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object Input {

  type AcceptAttribute = GlobalAttribute | InputAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Input =
    Input(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(children: Node*): Input =
    Input(attributes.toSet, children.toList)

}

final case class Input(attributes: Set[(Input.AcceptAttribute, _)], children: List[Node])
    extends Tag[Input.AcceptAttribute] {

  override val tagName: String = "input"

}
