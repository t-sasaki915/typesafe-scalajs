package net.st915.typesafescalajs.dom.tags.invisible

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.attributes.global.GlobalAttribute
import net.st915.typesafescalajs.dom.attributes.html.TrackAttribute
import net.st915.typesafescalajs.dom.tags.Tag

object Track {

  type AcceptAttribute = GlobalAttribute | TrackAttribute

  def apply(attributes: (AcceptAttribute, _)*): Track =
    Track(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(children: Node*): Track =
    Track(attributes.toSet, children.toList)

}

final case class Track(attributes: Set[(Track.AcceptAttribute, _)], children: List[Node])
    extends Tag[Track.AcceptAttribute] {

  override val tagName: String = "track"

}
