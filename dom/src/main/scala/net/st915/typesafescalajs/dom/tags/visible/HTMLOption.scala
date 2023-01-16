package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.dom.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{OptionAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object HTMLOption {

  type AcceptAttribute = GlobalAttribute | OptionAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): HTMLOption =
    HTMLOption(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): HTMLOption =
    HTMLOption(attributes.toSet, childs.toList)

}

final case class HTMLOption(attributes: Set[(HTMLOption.AcceptAttribute, _)], childs: List[Node])
    extends Tag[HTMLOption.AcceptAttribute]
