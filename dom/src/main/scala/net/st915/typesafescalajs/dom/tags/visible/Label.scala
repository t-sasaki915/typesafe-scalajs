package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{LabelAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object Label {

  type AcceptAttribute = GlobalAttribute | LabelAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Label =
    Label(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(children: Node*): Label =
    Label(attributes.toSet, children.toList)

}

final case class Label(attributes: Set[(Label.AcceptAttribute, _)], children: List[Node])
    extends Tag[Label.AcceptAttribute] {

  override val tagName: String = "label"

}
