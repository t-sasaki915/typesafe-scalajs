package net.st915.typesafescalajsdom.syntax

import net.st915.typesafescalajsdom.TextNode

trait TextNodeSyntax {

  def txtNode(content: String): TextNode = TextNode(content)

}
