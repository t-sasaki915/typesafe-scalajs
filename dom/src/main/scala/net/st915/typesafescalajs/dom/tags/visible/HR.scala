package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{HRAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object HR {

  type AcceptAttribute = GlobalAttribute | HRAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): HR =
    HR(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(children: Node*): HR =
    HR(attributes.toSet, children.toList)

}

final case class HR(attributes: Set[(HR.AcceptAttribute, _)], children: List[Node])
    extends Tag[HR.AcceptAttribute]
