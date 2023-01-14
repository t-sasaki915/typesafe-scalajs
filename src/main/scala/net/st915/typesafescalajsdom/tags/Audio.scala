package net.st915.typesafescalajsdom.tags

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.AudioAttribute

object Audio {

  type AcceptAttribute = GlobalAttribute | AudioAttribute

  def apply(attributes: (AcceptAttribute, _)*): Audio =
    Audio(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Audio =
    Audio(attributes.toSet, childs.toList)

}

final case class Audio(attributes: Set[(Audio.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Audio.AcceptAttribute]
