package net.st915.typesafescalajsdom.tags

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.{BRAttribute, VisibleElementAttribute}

object BR {

  type AcceptAttribute = GlobalAttribute | BRAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): BR =
    BR(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): BR =
    BR(attributes.toSet, childs.toList)

}

final case class BR(attributes: Set[(BR.AcceptAttribute, _)], childs: List[Node])
    extends Tag[BR.AcceptAttribute]
