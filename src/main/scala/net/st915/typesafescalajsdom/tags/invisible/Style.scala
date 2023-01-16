package net.st915.typesafescalajsdom.tags.invisible

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.StyleAttribute
import net.st915.typesafescalajsdom.tags.Tag

object Style {

  type AcceptAttribute = GlobalAttribute | StyleAttribute

  def apply(attributes: (AcceptAttribute, _)*): Style =
    Style(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Style =
    Style(attributes.toSet, childs.toList)

}

final case class Style(attributes: Set[(Style.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Style.AcceptAttribute]
