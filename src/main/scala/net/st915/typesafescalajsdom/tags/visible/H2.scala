package net.st915.typesafescalajsdom.tags.visible

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.{HeadingAttribute, VisibleElementAttribute}
import net.st915.typesafescalajsdom.tags.Tag

object H2 {

  type AcceptAttribute = GlobalAttribute | HeadingAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): H2 =
    H2(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): H2 =
    H2(attributes.toSet, childs.toList)

}

final case class H2(attributes: Set[(H2.AcceptAttribute, _)], childs: List[Node])
    extends Tag[H2.AcceptAttribute]
