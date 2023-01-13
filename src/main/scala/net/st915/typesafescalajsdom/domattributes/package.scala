package net.st915.typesafescalajsdom

package object domattributes {

  type StringAttribute = DomAttribute.StringAttribute
  type NumberAttribute = DomAttribute.NumberAttribute

  final case class Alt(override val raw: String) extends StringAttribute
  final case class ClassName(override val raw: String) extends StringAttribute
  final case class Height(override val raw: Int) extends NumberAttribute
  final case class Href(override val raw: String) extends StringAttribute
  final case class Lang(override val raw: String) extends StringAttribute
  final case class Src(override val raw: String) extends StringAttribute
  final case class Title(override val raw: String) extends StringAttribute
  final case class Width(override val raw: Int) extends NumberAttribute

}
