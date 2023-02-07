package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{HeadingAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object H5 {

  type AcceptAttribute = GlobalAttribute | HeadingAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): H5 =
    H5(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(children: Node*): H5 =
    H5(attributes.toSet, children.toList)

}

final case class H5(attributes: Set[(H5.AcceptAttribute, _)], children: List[Node])
    extends Tag[H5.AcceptAttribute] {

  override val tagName: String = "h5"
  
}
