package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{ObjectAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object HTMLObject {

  type AcceptAttribute = GlobalAttribute | ObjectAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): HTMLObject =
    HTMLObject(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(children: Node*): HTMLObject =
    HTMLObject(attributes.toSet, children.toList)

}

final case class HTMLObject(attributes: Set[(HTMLObject.AcceptAttribute, _)], children: List[Node])
    extends Tag[HTMLObject.AcceptAttribute]
