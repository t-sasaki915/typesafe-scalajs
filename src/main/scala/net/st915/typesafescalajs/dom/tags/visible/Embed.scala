package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.dom.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{EmbedAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object Embed {

  type AcceptAttribute = GlobalAttribute | EmbedAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Embed =
    Embed(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Embed =
    Embed(attributes.toSet, childs.toList)

}

final case class Embed(attributes: Set[(Embed.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Embed.AcceptAttribute]
