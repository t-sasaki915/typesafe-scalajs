package net.st915.typesafescalajsdom.tags.visible

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.{HeadingAttribute, VisibleElementAttribute}
import net.st915.typesafescalajsdom.tags.Tag

object H5 {

  type AcceptAttribute = GlobalAttribute | HeadingAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): H5 =
    H5(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): H5 =
    H5(attributes.toSet, childs.toList)

}

final case class H5(attributes: Set[(H5.AcceptAttribute, _)], childs: List[Node])
    extends Tag[H5.AcceptAttribute]
