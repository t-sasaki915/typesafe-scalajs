package net.st915.typesafescalajsdom.domattributes

import cats.{Eq, Monoid}

object Title {

  import cats.syntax.semigroup.*

  given Eq[Title] = Eq.fromUniversalEquals

  given Monoid[Title] with
    override def combine(x: Title, y: Title): Title = Title(x.raw |+| y.raw)
    override def empty: Title = Title("")

}

final case class Title(override val raw: String) extends DomAttribute.StringAttribute
