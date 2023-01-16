package net.st915.typesafescalajs.dom.tags.invisible

import net.st915.typesafescalajs.dom.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.ScriptAttribute
import net.st915.typesafescalajs.dom.tags.Tag

object Script {

  type AcceptAttribute = GlobalAttribute | ScriptAttribute

  def apply(attributes: (AcceptAttribute, _)*): Script =
    Script(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Script =
    Script(attributes.toSet, childs.toList)

}

final case class Script(attributes: Set[(Script.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Script.AcceptAttribute]
