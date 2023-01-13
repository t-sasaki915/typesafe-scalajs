package net.st915.typesafescalajsdom.domattributes

import cats.{Eq, Monoid}

object Lang {

  import cats.syntax.semigroup.*

  given Eq[Lang] = Eq.fromUniversalEquals

  given Monoid[Lang] with
    override def combine(x: Lang, y: Lang): Lang = Lang(x.raw |+| y.raw)
    override def empty: Lang = Lang("")

}

final case class Lang(override val raw: String) extends DomAttribute.StringAttribute
