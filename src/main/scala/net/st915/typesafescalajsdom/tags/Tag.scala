package net.st915.typesafescalajsdom.tags

import net.st915.typesafescalajsdom.Node

trait Tag[A] extends Node {

  def attributes: Set[(A, _)]

  def childs: List[Node]

}
