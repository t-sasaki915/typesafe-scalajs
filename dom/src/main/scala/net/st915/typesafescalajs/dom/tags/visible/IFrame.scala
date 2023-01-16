package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{IFrameAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object IFrame {

  type AcceptAttribute = GlobalAttribute | IFrameAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): IFrame =
    IFrame(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): IFrame =
    IFrame(attributes.toSet, childs.toList)

}

final case class IFrame(attributes: Set[(IFrame.AcceptAttribute, _)], childs: List[Node])
    extends Tag[IFrame.AcceptAttribute]
