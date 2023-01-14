package net.st915.typesafescalajsdom.syntax

import net.st915.typesafescalajsdom.TextNode

import scala.language.implicitConversions

trait TextNodeSyntax {

  implicit def autoConvertString(content: String): TextNode = TextNode(content)

}
