package net.st915.typesafescalajsdom.properties

import cats.{Eq, Monoid}

object Id {

  import cats.syntax.semigroup.*

  given Eq[Id] = Eq.fromUniversalEquals

  given Monoid[Id] with
    override def combine(x: Id, y: Id): Id =
      Id(x.raw |+| y.raw)

    override def empty: Id = Id("")

}

case class Id(raw: String)
