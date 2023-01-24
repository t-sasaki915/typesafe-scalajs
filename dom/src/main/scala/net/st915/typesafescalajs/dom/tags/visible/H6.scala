package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{HeadingAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object H6 {

  type AcceptAttribute = GlobalAttribute | HeadingAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): H6 =
    H6(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(children: Node*): H6 =
    H6(attributes.toSet, children.toList)

}

final case class H6(attributes: Set[(H6.AcceptAttribute, _)], children: List[Node])
    extends Tag[H6.AcceptAttribute]
