package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{TextAreaAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object TextArea {

  type AcceptAttribute = GlobalAttribute | TextAreaAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): TextArea =
    TextArea(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(children: Node*): TextArea =
    TextArea(attributes.toSet, children.toList)

}

final case class TextArea(attributes: Set[(TextArea.AcceptAttribute, _)], children: List[Node])
    extends Tag[TextArea.AcceptAttribute]
