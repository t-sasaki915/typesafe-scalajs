package net.st915.typesafescalajs.renderer.typeclasses

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.renderer.Environment
import net.st915.typesafescalajs.renderer.domain.typealiases.NativeNode

object CanConvertNodesAndAppend {

  def apply[F[_]](using ev: CanConvertNodesAndAppend[F]): CanConvertNodesAndAppend[F] = ev

}

trait CanConvertNodesAndAppend[F[_]] {

  def convertNodesAndAppend(parent: NativeNode)(nodes: List[Node])(using Environment): F[Unit]

}
