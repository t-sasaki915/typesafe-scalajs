package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{HeadingAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object H3 {

  type AcceptAttribute = GlobalAttribute | HeadingAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): H3 =
    H3(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(children: Node*): H3 =
    H3(attributes.toSet, children.toList)

}

final case class H3(attributes: Set[(H3.AcceptAttribute, _)], children: List[Node])
    extends Tag[H3.AcceptAttribute]
