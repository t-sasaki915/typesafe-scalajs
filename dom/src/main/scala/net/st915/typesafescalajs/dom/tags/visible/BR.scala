package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{BRAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object BR {

  type AcceptAttribute = GlobalAttribute | BRAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): BR =
    BR(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(children: Node*): BR =
    BR(attributes.toSet, children.toList)

}

final case class BR(attributes: Set[(BR.AcceptAttribute, _)], children: List[Node])
    extends Tag[BR.AcceptAttribute]
