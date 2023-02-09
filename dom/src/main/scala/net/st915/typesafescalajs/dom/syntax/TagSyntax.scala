package net.st915.typesafescalajs.dom.syntax

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.tags.Tag

import scala.language.implicitConversions

trait TagSyntax {

  implicit def tagAutoComplete[A](partlyApplied: Seq[Node] => Tag[A]): Tag[A] =
    partlyApplied(Nil)

}
