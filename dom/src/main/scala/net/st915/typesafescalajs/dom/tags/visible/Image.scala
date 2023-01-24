package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{ImageAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object Image {

  type AcceptAttribute = GlobalAttribute | ImageAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Image =
    Image(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(children: Node*): Image =
    Image(attributes.toSet, children.toList)

}

final case class Image(attributes: Set[(Image.AcceptAttribute, _)], children: List[Node])
    extends Tag[Image.AcceptAttribute]
