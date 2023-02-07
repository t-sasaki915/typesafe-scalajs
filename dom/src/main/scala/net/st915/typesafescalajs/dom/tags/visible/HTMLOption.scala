package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{OptionAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object HTMLOption {

  type AcceptAttribute = GlobalAttribute | OptionAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): HTMLOption =
    HTMLOption(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(children: Node*): HTMLOption =
    HTMLOption(attributes.toSet, children.toList)

}

final case class HTMLOption(attributes: Set[(HTMLOption.AcceptAttribute, _)], children: List[Node])
    extends Tag[HTMLOption.AcceptAttribute] {

  override val tagName: String = "option"

}
