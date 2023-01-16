package net.st915.typesafescalajsdom.tags

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.ScriptAttribute

object Script {

  type AcceptAttribute = GlobalAttribute | ScriptAttribute

  def apply(attributes: (AcceptAttribute, _)*): Script =
    Script(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Script =
    Script(attributes.toSet, childs.toList)

}

final case class Script(attributes: Set[(Script.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Script.AcceptAttribute]
