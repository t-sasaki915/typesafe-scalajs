package net.st915.typesafescalajsdom.tags

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.{EmbedAttribute, VisibleElementAttribute}

object Embed {

  type AcceptAttribute = GlobalAttribute | EmbedAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Embed =
    Embed(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Embed =
    Embed(attributes.toSet, childs.toList)

}

final case class Embed(attributes: Set[(Embed.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Embed.AcceptAttribute]
