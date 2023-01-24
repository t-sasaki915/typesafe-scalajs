package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{HeadingAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object H2 {

  type AcceptAttribute = GlobalAttribute | HeadingAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): H2 =
    H2(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(children: Node*): H2 =
    H2(attributes.toSet, children.toList)

}

final case class H2(attributes: Set[(H2.AcceptAttribute, _)], children: List[Node])
    extends Tag[H2.AcceptAttribute]
