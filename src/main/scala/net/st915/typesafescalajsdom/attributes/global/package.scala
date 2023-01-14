package net.st915.typesafescalajsdom.attributes

import net.st915.typesafescalajsdom.attributes.Attribute

package object global {

  sealed trait GlobalAttribute

  case object accessKey extends Attribute[String] with GlobalAttribute

  case object className extends Attribute[String] with GlobalAttribute

  case object contentEditable extends Attribute[Boolean] with GlobalAttribute

  case object dir extends Attribute[String] with GlobalAttribute

  case object draggable extends Attribute[Boolean] with GlobalAttribute

  case object hidden extends Attribute[Boolean] with GlobalAttribute

  case object id extends Attribute[String] with GlobalAttribute

  case object lang extends Attribute[String] with GlobalAttribute

  case object spellCheck extends Attribute[Boolean] with GlobalAttribute

  case object tabIndex extends Attribute[Int] with GlobalAttribute

  case object title extends Attribute[String] with GlobalAttribute

  case object translate extends Attribute[Boolean] with GlobalAttribute

}
