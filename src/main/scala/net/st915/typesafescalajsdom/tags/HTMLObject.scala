package net.st915.typesafescalajsdom.tags

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.{ObjectAttribute, VisibleElementAttribute}

object HTMLObject {

  type AcceptAttribute = GlobalAttribute | ObjectAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): HTMLObject =
    HTMLObject(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): HTMLObject =
    HTMLObject(attributes.toSet, childs.toList)

}

final case class HTMLObject(attributes: Set[(HTMLObject.AcceptAttribute, _)], childs: List[Node])
    extends Tag[HTMLObject.AcceptAttribute]
