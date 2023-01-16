package net.st915.typesafescalajsdom.tags.visible

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.{VideoAttribute, VisibleElementAttribute}
import net.st915.typesafescalajsdom.tags.Tag

object Video {

  type AcceptAttribute = GlobalAttribute | VideoAttribute | VisibleElementAttribute

  def apply(attributes: (AcceptAttribute, _)*): Video =
    Video(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Video =
    Video(attributes.toSet, childs.toList)

}

final case class Video(attributes: Set[(Video.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Video.AcceptAttribute]
