package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{OListAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object OList {

  type AcceptAttribute = GlobalAttribute | OListAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): OList =
    OList(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): OList =
    OList(attributes.toSet, childs.toList)

}

final case class OList(attributes: Set[(OList.AcceptAttribute, _)], childs: List[Node])
    extends Tag[OList.AcceptAttribute]
