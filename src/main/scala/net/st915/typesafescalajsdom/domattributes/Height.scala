package net.st915.typesafescalajsdom.domattributes

import cats.{Eq, Monoid}

object Height {

  import cats.syntax.semigroup.*

  given Eq[Height] = Eq.fromUniversalEquals

  given Monoid[Height] with
    override def combine(x: Height, y: Height): Height = Height(x.raw |+| y.raw)
    override def empty: Height = Height(0)

}

final case class Height(override val raw: Int) extends DomAttribute.NumberAttribute
