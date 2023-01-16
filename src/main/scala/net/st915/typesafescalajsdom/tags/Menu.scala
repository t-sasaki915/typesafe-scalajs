package net.st915.typesafescalajsdom.tags

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.{MenuAttribute, VisibleElementAttribute}

object Menu {

  type AcceptAttribute = GlobalAttribute | MenuAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Menu =
    Menu(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Menu =
    Menu(attributes.toSet, childs.toList)

}

final case class Menu(attributes: Set[(Menu.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Menu.AcceptAttribute]
