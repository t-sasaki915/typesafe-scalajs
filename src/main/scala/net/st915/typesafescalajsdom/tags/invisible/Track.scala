package net.st915.typesafescalajsdom.tags.invisible

import net.st915.typesafescalajsdom.Node
import net.st915.typesafescalajsdom.attributes.global.GlobalAttribute
import net.st915.typesafescalajsdom.attributes.html.TrackAttribute
import net.st915.typesafescalajsdom.tags.Tag

object Track {

  type AcceptAttribute = GlobalAttribute | TrackAttribute

  def apply(attributes: (AcceptAttribute, _)*): Track =
    Track(attributes.toSet, Nil)

  def apply(attributes: (AcceptAttribute, _)*)(childs: Node*): Track =
    Track(attributes.toSet, childs.toList)

}

final case class Track(attributes: Set[(Track.AcceptAttribute, _)], childs: List[Node])
    extends Tag[Track.AcceptAttribute]
