package net.st915.typesafescalajsdom.domattributes

import cats.{Eq, Monoid}

object Href {

  import cats.syntax.semigroup.*

  given Eq[Href] = Eq.fromUniversalEquals

  given Monoid[Href] with
    override def combine(x: Href, y: Href): Href = Href(x.raw |+| y.raw)
    override def empty: Href = Href("")

}

final case class Href(override val raw: String) extends DomAttribute.StringAttribute
