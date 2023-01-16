package net.st915.typesafescalajsdom.tags

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.{ImageAttribute, VisibleElementAttribute}

object Image {

  type AcceptAttribute = GlobalAttribute | ImageAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Image =
    Image(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Image =
    Image(attributes.toSet, childs.toList)

}

final case class Image(attributes: Set[(Image.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Image.AcceptAttribute]
