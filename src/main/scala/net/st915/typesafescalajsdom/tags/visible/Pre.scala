package net.st915.typesafescalajsdom.tags.visible

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.{PreAttribute, VisibleElementAttribute}
import net.st915.typesafescalajsdom.tags.Tag

object Pre {

  type AcceptAttribute = GlobalAttribute | PreAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Pre =
    Pre(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Pre =
    Pre(attributes.toSet, childs.toList)

}

final case class Pre(attributes: Set[(Pre.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Pre.AcceptAttribute]
