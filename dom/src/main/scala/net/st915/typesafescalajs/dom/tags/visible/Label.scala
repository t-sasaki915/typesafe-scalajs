package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{LabelAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object Label {

  type AcceptAttribute = GlobalAttribute | LabelAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Label =
    Label(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Label =
    Label(attributes.toSet, childs.toList)

}

final case class Label(attributes: Set[(Label.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Label.AcceptAttribute]
