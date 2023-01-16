package net.st915.typesafescalajsdom.tags

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.{CanvasAttribute, VisibleElementAttribute}

object Canvas {

  type AcceptAttribute = GlobalAttribute | CanvasAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Canvas =
    Canvas(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Canvas =
    Canvas(attributes.toSet, childs.toList)

}

final case class Canvas(attributes: Set[(Canvas.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Canvas.AcceptAttribute]
