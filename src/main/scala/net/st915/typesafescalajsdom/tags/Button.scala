package net.st915.typesafescalajsdom.tags

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.{ButtonAttribute, VisibleElementAttribute}

object Button {

  type AcceptAttribute = GlobalAttribute | ButtonAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Button =
    Button(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Button =
    Button(attributes.toSet, childs.toList)

}

final case class Button(attributes: Set[(Button.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Button.AcceptAttribute]
