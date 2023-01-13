package net.st915.typesafescalajsdom.domattributes

import cats.{Eq, Monoid}

object ClassName {

  import cats.syntax.semigroup.*

  given Eq[ClassName] = Eq.fromUniversalEquals

  given Monoid[ClassName] with
    override def combine(x: ClassName, y: ClassName): ClassName = ClassName(x.raw |+| y.raw)
    override def empty: ClassName = ClassName("")

}

final case class ClassName(override val raw: String) extends DomAttribute.StringAttribute
