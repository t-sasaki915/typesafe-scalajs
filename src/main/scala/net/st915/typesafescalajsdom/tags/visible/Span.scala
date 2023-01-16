package net.st915.typesafescalajsdom.tags.visible

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.{SpanAttribute, VisibleElementAttribute}
import net.st915.typesafescalajsdom.tags.Tag

object Span {

  type AcceptAttribute = GlobalAttribute | SpanAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Span =
    Span(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Span =
    Span(attributes.toSet, childs.toList)

}

final case class Span(attributes: Set[(Span.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Span.AcceptAttribute]
