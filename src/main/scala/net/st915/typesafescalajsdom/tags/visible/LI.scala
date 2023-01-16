package net.st915.typesafescalajsdom.tags.visible

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.{LIAttribute, VisibleElementAttribute}
import net.st915.typesafescalajsdom.tags.Tag

object LI {

  type AcceptAttribute = GlobalAttribute | LIAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): LI =
    LI(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): LI =
    LI(attributes.toSet, childs.toList)

}

final case class LI(attributes: Set[(LI.AcceptAttribute, _)], childs: List[Node])
    extends Tag[LI.AcceptAttribute]
