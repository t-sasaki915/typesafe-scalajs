package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{QuoteAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object Quote {

  type AcceptAttribute = GlobalAttribute | QuoteAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Quote =
    Quote(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Quote =
    Quote(attributes.toSet, childs.toList)

}

final case class Quote(attributes: Set[(Quote.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Quote.AcceptAttribute]
