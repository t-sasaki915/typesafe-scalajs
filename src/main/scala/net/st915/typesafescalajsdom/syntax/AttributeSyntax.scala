package net.st915.typesafescalajsdom.syntax

import net.st915.typesafescalajsdom.attributes.Attribute

trait AttributeSyntax {

  extension [A, B <: Attribute[A]](x: B) {

    def :=(value: A): (B, A) = (x, value)

  }

}
