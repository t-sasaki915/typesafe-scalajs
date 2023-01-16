package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.dom.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{HRAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object HR {

  type AcceptAttribute = GlobalAttribute | HRAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): HR =
    HR(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): HR =
    HR(attributes.toSet, childs.toList)

}

final case class HR(attributes: Set[(HR.AcceptAttribute, _)], childs: List[Node])
    extends Tag[HR.AcceptAttribute]
