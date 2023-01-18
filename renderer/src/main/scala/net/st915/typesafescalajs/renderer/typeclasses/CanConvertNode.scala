package net.st915.typesafescalajs.renderer.typeclasses

import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.renderer.Environment
import net.st915.typesafescalajs.renderer.domain.typealiases.NativeNode

object CanConvertNode {

  def apply[F[_]](using ev: CanConvertNode[F]): CanConvertNode[F] = ev

}

trait CanConvertNode[F[_]] {

  def convertNode(node: Node)(using Environment): F[NativeNode]

}
