package net.st915.typesafescalajs.dom.tags.invisible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.StyleAttribute
import net.st915.typesafescalajs.dom.tags.Tag

object Style {

  type AcceptAttribute = GlobalAttribute | StyleAttribute

  def apply(attributes: (AcceptAttribute, _)*): Style =
    Style(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(children: Node*): Style =
    Style(attributes.toSet, children.toList)

}

final case class Style(attributes: Set[(Style.AcceptAttribute, _)], children: List[Node])
    extends Tag[Style.AcceptAttribute]
