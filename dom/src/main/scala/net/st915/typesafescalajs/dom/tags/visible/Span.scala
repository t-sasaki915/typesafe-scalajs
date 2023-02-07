package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{SpanAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object Span {

  type AcceptAttribute = GlobalAttribute | SpanAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Span =
    Span(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(children: Node*): Span =
    Span(attributes.toSet, children.toList)

}

final case class Span(attributes: Set[(Span.AcceptAttribute, _)], children: List[Node])
    extends Tag[Span.AcceptAttribute] {

  override val tagName: String = "span"

}
