package net.st915.typesafescalajsdom.properties

import org.scalatest.*

import flatspec.*
import matchers.*

class IdSpec extends AnyFlatSpec with should.Matchers {

  import cats.syntax.all.*

  "Eq.eqv" should "be able to compare correctly" in {
    Id("AA") eqv Id("AA") should be(true)
    Id("AA") =!= Id("BB") should be(true)
  }

  "Monoid.combine" should "be able to combine correctly" in {
    Id("AA") |+| Id("BB") should be(Id("AABB"))
  }

}
