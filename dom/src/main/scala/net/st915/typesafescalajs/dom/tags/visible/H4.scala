package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{HeadingAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object H4 {

  type AcceptAttribute = GlobalAttribute | HeadingAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): H4 =
    H4(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(children: Node*): H4 =
    H4(attributes.toSet, children.toList)

}

final case class H4(attributes: Set[(H4.AcceptAttribute, _)], children: List[Node])
    extends Tag[H4.AcceptAttribute] {

  override val tagName: String = "h4"

}
