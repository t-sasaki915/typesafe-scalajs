package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{FormAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object Form {

  type AcceptAttribute = GlobalAttribute | FormAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Form =
    Form(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Form =
    Form(attributes.toSet, childs.toList)

}

final case class Form(attributes: Set[(Form.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Form.AcceptAttribute]
