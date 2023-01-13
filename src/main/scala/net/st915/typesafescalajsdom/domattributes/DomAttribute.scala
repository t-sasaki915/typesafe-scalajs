package net.st915.typesafescalajsdom.domattributes

object DomAttribute {

  trait StringAttribute extends DomAttribute[String]
  trait NumberAttribute extends DomAttribute[Int]

}

sealed trait DomAttribute[A] {

  def raw: A

}
