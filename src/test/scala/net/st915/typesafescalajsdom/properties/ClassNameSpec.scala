package net.st915.typesafescalajsdom.properties

import org.scalatest.*

import flatspec.*
import matchers.*

class ClassNameSpec extends AnyFlatSpec with should.Matchers {

  import cats.syntax.all.*

  "Eq.eqv" should "be able to compare correctly" in {
    ClassName("AA") eqv ClassName("AA") should be(true)
    ClassName("AA") =!= ClassName("BB") should be(true)
  }

  "Monoid.combine" should "be able to combine correctly" in {
    ClassName("AA") |+| ClassName("BB") should be(ClassName("AA BB"))
  }

}
