package net.st915.typesafescalajsdom.syntax

import net.st915.typesafescalajsdom.attributes.{Attribute, FlagAttribute}

import scala.language.implicitConversions

trait AttributeSyntax {

  implicit def autoApplyFlagAttribute[A <: FlagAttribute](flagAttribute: A): (A, Boolean) =
    (flagAttribute, true)

  extension [A, B <: Attribute[A]](x: B) {

    def :=(value: A): (B, A) = (x, value)

  }

}
