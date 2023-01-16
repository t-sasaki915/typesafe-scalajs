package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.dom.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{ImageAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object Image {

  type AcceptAttribute = GlobalAttribute | ImageAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Image =
    Image(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Image =
    Image(attributes.toSet, childs.toList)

}

final case class Image(attributes: Set[(Image.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Image.AcceptAttribute]
