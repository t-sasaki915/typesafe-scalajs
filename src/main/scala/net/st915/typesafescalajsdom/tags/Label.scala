package net.st915.typesafescalajsdom.tags

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.{LabelAttribute, VisibleElementAttribute}

object Label {

  type AcceptAttribute = GlobalAttribute | LabelAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Label =
    Label(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Label =
    Label(attributes.toSet, childs.toList)

}

final case class Label(attributes: Set[(Label.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Label.AcceptAttribute]
