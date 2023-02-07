package net.st915.typesafescalajs.dom.syntax

import cats.Monoid
import net.st915.typesafescalajs.dom.attributes.{AllowEmptyAttribute, FlagAttribute}

import scala.language.implicitConversions

trait AttributeSyntax {

  implicit def flatAttributeAutoComplete[A <: FlagAttribute](attr: A): (A, Boolean) =
    (attr, true)

  implicit def allowEmptyAttributeAutoComplete[A <: AllowEmptyAttribute[B], B: Monoid](attr: A)
    : (A, B) =
    (attr, Monoid[B].empty)

}
