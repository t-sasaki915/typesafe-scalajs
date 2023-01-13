package net.st915.typesafescalajsdom.domattributes

import cats.{Eq, Monoid}

object Width {

  import cats.syntax.semigroup.*

  given Eq[Width] = Eq.fromUniversalEquals

  given Monoid[Width] with
    override def combine(x: Width, y: Width): Width = Width(x.raw |+| y.raw)
    override def empty: Width = Width(0)

}

final case class Width(override val raw: Int) extends DomAttribute.NumberAttribute
