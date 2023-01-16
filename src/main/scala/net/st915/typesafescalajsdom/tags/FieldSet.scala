package net.st915.typesafescalajsdom.tags

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.{FieldSetAttribute, VisibleElementAttribute}

object FieldSet {

  type AcceptAttribute = GlobalAttribute | FieldSetAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): FieldSet =
    FieldSet(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): FieldSet =
    FieldSet(attributes.toSet, childs.toList)

}

final case class FieldSet(attributes: Set[(FieldSet.AcceptAttribute, _)], childs: List[Node])
    extends Tag[FieldSet.AcceptAttribute]
