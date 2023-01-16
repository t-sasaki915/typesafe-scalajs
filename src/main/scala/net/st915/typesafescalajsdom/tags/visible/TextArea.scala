package net.st915.typesafescalajsdom.tags.visible

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.{TextAreaAttribute, VisibleElementAttribute}
import net.st915.typesafescalajsdom.tags.Tag

object TextArea {

  type AcceptAttribute = GlobalAttribute | TextAreaAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): TextArea =
    TextArea(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): TextArea =
    TextArea(attributes.toSet, childs.toList)

}

final case class TextArea(attributes: Set[(TextArea.AcceptAttribute, _)], childs: List[Node])
    extends Tag[TextArea.AcceptAttribute]
