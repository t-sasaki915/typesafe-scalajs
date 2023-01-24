package net.st915.typesafescalajs.dom.tags.visible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.{VideoAttribute, VisibleElementAttribute}
import net.st915.typesafescalajs.dom.tags.Tag

object Video {

  type AcceptAttribute = GlobalAttribute | VideoAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Video =
    Video(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(children: Node*): Video =
    Video(attributes.toSet, children.toList)

}

final case class Video(attributes: Set[(Video.AcceptAttribute, _)], children: List[Node])
    extends Tag[Video.AcceptAttribute]
