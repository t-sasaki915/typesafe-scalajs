package net.st915.typesafescalajsdom.tags.visible

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.{DialogAttribute, VisibleElementAttribute}
import net.st915.typesafescalajsdom.tags.Tag

object Dialog {

  type AcceptAttribute = GlobalAttribute | DialogAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Dialog =
    Dialog(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Dialog =
    Dialog(attributes.toSet, childs.toList)

}

final case class Dialog(attributes: Set[(Dialog.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Dialog.AcceptAttribute]
