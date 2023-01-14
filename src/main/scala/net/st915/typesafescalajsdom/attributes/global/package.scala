package net.st915.typesafescalajsdom.attributes

import net.st915.typesafescalajsdom.attributes.Attribute

package object global {

  sealed trait GlobalAttribute

  object accessKey extends Attribute[String] with GlobalAttribute

  object className extends Attribute[String] with GlobalAttribute

  object contentEditable extends Attribute[Boolean] with GlobalAttribute

  object dir extends Attribute[String] with GlobalAttribute

  object draggable extends Attribute[Boolean] with GlobalAttribute

  object hidden extends Attribute[Boolean] with GlobalAttribute

  object id extends Attribute[String] with GlobalAttribute

  object lang extends Attribute[String] with GlobalAttribute

  object spellCheck extends Attribute[Boolean] with GlobalAttribute

  object tabIndex extends Attribute[Int] with GlobalAttribute

  object title extends Attribute[String] with GlobalAttribute

  object translate extends Attribute[Boolean] with GlobalAttribute

}
