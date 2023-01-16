package net.st915.typesafescalajsdom.tags

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.{HRAttribute, VisibleElementAttribute}

object HR {

  type AcceptAttribute = GlobalAttribute | HRAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): HR =
    HR(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): HR =
    HR(attributes.toSet, childs.toList)

}

final case class HR(attributes: Set[(HR.AcceptAttribute, _)], childs: List[Node])
    extends Tag[HR.AcceptAttribute]
