package net.st915.typesafescalajsdom.tags

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.{IFrameAttribute, VisibleElementAttribute}

object IFrame {

  type AcceptAttribute = GlobalAttribute | IFrameAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): IFrame =
    IFrame(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): IFrame =
    IFrame(attributes.toSet, childs.toList)

}

final case class IFrame(attributes: Set[(IFrame.AcceptAttribute, _)], childs: List[Node])
    extends Tag[IFrame.AcceptAttribute]
