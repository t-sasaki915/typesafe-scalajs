package net.st915.typesafescalajsdom.tags.invisible

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.TitleAttribute
import net.st915.typesafescalajsdom.tags.Tag

object Title {

  type AcceptAttribute = GlobalAttribute | TitleAttribute

  def apply(attributes: (AcceptAttribute, _)*): Title =
    Title(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Title =
    Title(attributes.toSet, childs.toList)

}

final case class Title(attributes: Set[(Title.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Title.AcceptAttribute]
