package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.dom.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{OptGroupAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object OptGroup {

  type AcceptAttribute = GlobalAttribute | OptGroupAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): OptGroup =
    OptGroup(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): OptGroup =
    OptGroup(attributes.toSet, childs.toList)

}

final case class OptGroup(attributes: Set[(OptGroup.AcceptAttribute, _)], childs: List[Node])
    extends Tag[OptGroup.AcceptAttribute]
