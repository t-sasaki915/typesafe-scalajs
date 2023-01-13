package net.st915.typesafescalajsdom.attributes

import net.st915.typesafescalajsdom.attributes.Attribute

package object global {

  sealed trait GlobalAttribute

  object accessKey extends Attribute[String] with GlobalAttribute:
    override def default: String = ""

  object className extends Attribute[String] with GlobalAttribute:
    override def default: String = ""

  object contentEditable extends Attribute[Boolean] with GlobalAttribute:
    override def default: Boolean = false

  object dir extends Attribute[String] with GlobalAttribute:
    override def default: String = ""

  object draggable extends Attribute[Boolean] with GlobalAttribute:
    override def default: Boolean = true

  object hidden extends Attribute[Boolean] with GlobalAttribute:
    override def default: Boolean = false

  object id extends Attribute[String] with GlobalAttribute:
    override def default: String = ""

  object lang extends Attribute[String] with GlobalAttribute:
    override def default: String = ""

  object spellCheck extends Attribute[Boolean] with GlobalAttribute:
    override def default: Boolean = true

  object tabIndex extends Attribute[Int] with GlobalAttribute:
    override def default: Int = 1

  object title extends Attribute[String] with GlobalAttribute:
    override def default: String = ""

  object translate extends Attribute[Boolean] with GlobalAttribute:
    override def default: Boolean = true

}
