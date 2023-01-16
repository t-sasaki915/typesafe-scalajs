package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{LIAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object LI {

  type AcceptAttribute = GlobalAttribute | LIAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): LI =
    LI(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): LI =
    LI(attributes.toSet, childs.toList)

}

final case class LI(attributes: Set[(LI.AcceptAttribute, _)], childs: List[Node])
    extends Tag[LI.AcceptAttribute]
