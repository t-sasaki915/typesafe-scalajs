package net.st915.typesafescalajsdom.tags.visible

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.{HeadingAttribute, VisibleElementAttribute}
import net.st915.typesafescalajsdom.tags.Tag

object H1 {

  type AcceptAttribute = GlobalAttribute | HeadingAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): H1 =
    H1(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): H1 =
    H1(attributes.toSet, childs.toList)

}

final case class H1(attributes: Set[(H1.AcceptAttribute, _)], childs: List[Node])
    extends Tag[H1.AcceptAttribute]
