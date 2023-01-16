package net.st915.typesafescalajsdom.tags

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.{InputAttribute, VisibleElementAttribute}

object Input {

  type AcceptAttribute = GlobalAttribute | InputAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Input =
    Input(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Input =
    Input(attributes.toSet, childs.toList)

}

final case class Input(attributes: Set[(Input.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Input.AcceptAttribute]
