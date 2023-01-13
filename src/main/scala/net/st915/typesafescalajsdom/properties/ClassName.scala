package net.st915.typesafescalajsdom.properties

import cats.{Eq, Monoid}

object ClassName {

  given Eq[ClassName] = Eq.fromUniversalEquals

  given Monoid[ClassName] with
    override def combine(x: ClassName, y: ClassName): ClassName =
      ClassName(s"${x.raw} ${y.raw}")

    override def empty: ClassName = ClassName("")

}

case class ClassName(raw: String)
