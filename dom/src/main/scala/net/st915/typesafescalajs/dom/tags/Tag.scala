package net.st915.typesafescalajs.dom.tags

import net.st915.typesafescalajs.Node

trait Tag[A] extends Node {

  val tagName: String

  val attributes: Set[(A, _)]

  val children: List[Node]

}
