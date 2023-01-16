package net.st915.typesafescalajsdom.tags.visible

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.{HeadingAttribute, VisibleElementAttribute}
import net.st915.typesafescalajsdom.tags.Tag

object H3 {

  type AcceptAttribute = GlobalAttribute | HeadingAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): H3 =
    H3(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): H3 =
    H3(attributes.toSet, childs.toList)

}

final case class H3(attributes: Set[(H3.AcceptAttribute, _)], childs: List[Node])
    extends Tag[H3.AcceptAttribute]
