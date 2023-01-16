package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{DialogAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object Dialog {

  type AcceptAttribute = GlobalAttribute | DialogAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Dialog =
    Dialog(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Dialog =
    Dialog(attributes.toSet, childs.toList)

}

final case class Dialog(attributes: Set[(Dialog.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Dialog.AcceptAttribute]
