package net.st915.typesafescalajs.dom.tags

import net.st915.typesafescalajs.Node

trait Tag[A] extends Node {

  def attributes: Set[(A, _)]

  def childs: List[Node]

}
