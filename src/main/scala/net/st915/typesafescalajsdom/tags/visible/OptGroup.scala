package net.st915.typesafescalajsdom.tags.visible

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.{OptGroupAttribute, VisibleElementAttribute}
import net.st915.typesafescalajsdom.tags.Tag

object OptGroup {

  type AcceptAttribute = GlobalAttribute | OptGroupAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): OptGroup =
    OptGroup(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): OptGroup =
    OptGroup(attributes.toSet, childs.toList)

}

final case class OptGroup(attributes: Set[(OptGroup.AcceptAttribute, _)], childs: List[Node])
    extends Tag[OptGroup.AcceptAttribute]
