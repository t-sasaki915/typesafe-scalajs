package net.st915.typesafescalajs.dom.syntax

import net.st915.typesafescalajs.dom.TextNode

import scala.language.implicitConversions

trait TextNodeSyntax {

  implicit def autoConvertString(content: String): TextNode = TextNode(content)

}
