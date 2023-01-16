package net.st915.typesafescalajsdom.tags

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.{QuoteAttribute, VisibleElementAttribute}

object Quote {

  type AcceptAttribute = GlobalAttribute | QuoteAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Quote =
    Quote(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Quote =
    Quote(attributes.toSet, childs.toList)

}

final case class Quote(attributes: Set[(Quote.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Quote.AcceptAttribute]
