package net.st915.typesafescalajsdom.domattributes

import cats.{Eq, Monoid}

object Src {

  import cats.syntax.semigroup.*

  given Eq[Src] = Eq.fromUniversalEquals

  given Monoid[Src] with
    override def combine(x: Src, y: Src): Src = Src(x.raw |+| y.raw)
    override def empty: Src = Src("")

}

final case class Src(override val raw: String) extends DomAttribute.StringAttribute
