package net.st915.typesafescalajsdom.tags

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.ParamAttribute

object Param {

  type AcceptAttribute = GlobalAttribute | ParamAttribute

  def apply(attributes: (AcceptAttribute, _)*): Param =
    Param(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Param =
    Param(attributes.toSet, childs.toList)

}

final case class Param(attributes: Set[(Param.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Param.AcceptAttribute]
