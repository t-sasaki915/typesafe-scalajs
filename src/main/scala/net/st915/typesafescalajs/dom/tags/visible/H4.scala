package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.dom.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{HeadingAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object H4 {

  type AcceptAttribute = GlobalAttribute | HeadingAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): H4 =
    H4(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): H4 =
    H4(attributes.toSet, childs.toList)

}

final case class H4(attributes: Set[(H4.AcceptAttribute, _)], childs: List[Node])
    extends Tag[H4.AcceptAttribute]
