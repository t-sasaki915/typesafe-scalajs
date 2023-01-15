package net.st915.typesafescalajsdom.syntax

import net.st915.typesafescalajsdom.attributes.{Attribute, FlagAttribute}

import scala.annotation.targetName
import scala.language.implicitConversions

trait AttributeSyntax {

  implicit def autoApplyFlagAttribute[A <: FlagAttribute](flagAttribute: A): (A, Boolean) =
    (flagAttribute, true)

  extension [A <: Attribute[B], B](x: A) {

    @targetName(":=")
    def :=(value: B): (A, B) = (x, value)

  }

}
