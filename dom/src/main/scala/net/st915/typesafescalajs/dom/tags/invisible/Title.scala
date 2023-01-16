package net.st915.typesafescalajs.dom.tags.invisible

import net.st915.typesafescalajs.dom.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.TitleAttribute
import net.st915.typesafescalajs.dom.tags.Tag

object Title {

  type AcceptAttribute = GlobalAttribute | TitleAttribute

  def apply(attributes: (AcceptAttribute, _)*): Title =
    Title(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Title =
    Title(attributes.toSet, childs.toList)

}

final case class Title(attributes: Set[(Title.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Title.AcceptAttribute]