package net.st915.typesafescalajs.dom.attributes

import cats.Monoid

trait AllowEmptyAttribute[A: Monoid] extends Attribute[A]
