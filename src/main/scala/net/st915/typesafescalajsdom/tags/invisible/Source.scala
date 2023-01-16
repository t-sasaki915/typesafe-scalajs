package net.st915.typesafescalajsdom.tags.invisible

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.SourceAttribute
import net.st915.typesafescalajsdom.tags.Tag

object Source {

  type AcceptAttribute = GlobalAttribute | SourceAttribute

  def apply(attributes: (AcceptAttribute, _)*): Source =
    Source(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Source =
    Source(attributes.toSet, childs.toList)

}

final case class Source(attributes: Set[(Source.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Source.AcceptAttribute]
