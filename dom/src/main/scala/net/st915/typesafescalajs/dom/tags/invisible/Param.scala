package net.st915.typesafescalajs.dom.tags.invisible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.ParamAttribute
import net.st915.typesafescalajs.dom.tags.Tag

object Param {

  type AcceptAttribute = GlobalAttribute | ParamAttribute

  def apply(attributes: (AcceptAttribute, _)*): Param =
    Param(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(children: Node*): Param =
    Param(attributes.toSet, children.toList)

}

final case class Param(attributes: Set[(Param.AcceptAttribute, _)], children: List[Node])
    extends Tag[Param.AcceptAttribute]
