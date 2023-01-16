package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.dom.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{ProgressAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object Progress {

  type AcceptAttribute = GlobalAttribute | ProgressAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Progress =
    Progress(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Progress =
    Progress(attributes.toSet, childs.toList)

}

final case class Progress(attributes: Set[(Progress.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Progress.AcceptAttribute]
