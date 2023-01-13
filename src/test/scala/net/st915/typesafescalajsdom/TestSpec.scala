package net.st915.typesafescalajsdom

import org.scalatest.*
import flatspec.*
import matchers.*

class TestSpec extends AnyFlatSpec with should.Matchers {

  "Test#aaa" should "return ABC" in {
    Test.aaa should be ("ABC")
  }

}
