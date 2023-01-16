package net.st915.typesafescalajsdom.tags

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.{ProgressAttribute, VisibleElementAttribute}

object Progress {

  type AcceptAttribute = GlobalAttribute | ProgressAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Progress =
    Progress(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Progress =
    Progress(attributes.toSet, childs.toList)

}

final case class Progress(attributes: Set[(Progress.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Progress.AcceptAttribute]
