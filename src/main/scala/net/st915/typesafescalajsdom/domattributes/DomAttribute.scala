package net.st915.typesafescalajsdom.domattributes

import cats.{Eq, Monoid}

object DomAttribute {

  import cats.syntax.all.*

  trait StringAttribute extends DomAttribute[String]
  trait NumberAttribute extends DomAttribute[Int]

  given domAttributeEq[A: Eq: Monoid]: Eq[DomAttribute[A]] with
    override def eqv(x: DomAttribute[A], y: DomAttribute[A]): Boolean = x.raw eqv y.raw

  given domAttributeMonoid[A: Eq: Monoid]: Monoid[DomAttribute[A]] with
    override def combine(x: DomAttribute[A], y: DomAttribute[A]): DomAttribute[A] =
      new DomAttribute[A]:
        override def raw: A = x.raw |+| y.raw
    override def empty: DomAttribute[A] =
      new DomAttribute[A]:
        override def raw: A = Monoid[A].empty

}

sealed trait DomAttribute[A: Eq: Monoid] {

  def raw: A

}
