package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{FieldSetAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object FieldSet {

  type AcceptAttribute = GlobalAttribute | FieldSetAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): FieldSet =
    FieldSet(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(children: Node*): FieldSet =
    FieldSet(attributes.toSet, children.toList)

}

final case class FieldSet(attributes: Set[(FieldSet.AcceptAttribute, _)], children: List[Node])
    extends Tag[FieldSet.AcceptAttribute]
