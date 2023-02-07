package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{CanvasAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object Canvas {

  type AcceptAttribute = GlobalAttribute | CanvasAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Canvas =
    Canvas(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(children: Node*): Canvas =
    Canvas(attributes.toSet, children.toList)

}

final case class Canvas(attributes: Set[(Canvas.AcceptAttribute, _)], children: List[Node])
    extends Tag[Canvas.AcceptAttribute] {

  override val tagName: String = "canvas"

}
