package net.st915.typesafescalajs.dom.attributes

import scala.annotation.targetName

trait Attribute[A] {

  @targetName(":=")
  def :=(value: A): (this.type, A) = (this, value)

}
