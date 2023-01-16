package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{InputAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object Input {

  type AcceptAttribute = GlobalAttribute | InputAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Input =
    Input(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Input =
    Input(attributes.toSet, childs.toList)

}

final case class Input(attributes: Set[(Input.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Input.AcceptAttribute]
