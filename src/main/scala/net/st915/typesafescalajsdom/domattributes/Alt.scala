package net.st915.typesafescalajsdom.domattributes

import cats.{Eq, Monoid}

object Alt {

  import cats.syntax.semigroup.*

  given Eq[Alt] = Eq.fromUniversalEquals

  given Monoid[Alt] with
    override def combine(x: Alt, y: Alt): Alt = Alt(x.raw |+| y.raw)
    override def empty: Alt = Alt("")

}

final case class Alt(override val raw: String) extends DomAttribute.StringAttribute
