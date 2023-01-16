package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{ButtonAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object Button {

  type AcceptAttribute = GlobalAttribute | ButtonAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Button =
    Button(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Button =
    Button(attributes.toSet, childs.toList)

}

final case class Button(attributes: Set[(Button.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Button.AcceptAttribute]
