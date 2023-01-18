package net.st915.typesafescalajs.renderer.typeclasses.instances

import cats.effect.Sync
import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.renderer.Environment
import net.st915.typesafescalajs.renderer.domain.typealiases.NativeNode
import net.st915.typesafescalajs.renderer.typeclasses.*

class SyncCanConvertNodesAndAppend[F[_]: Sync: CanConvertNode: CanAppendChild]
    extends CanConvertNodesAndAppend[F] {

  import cats.syntax.all.*

  override def convertNodesAndAppend(parent: NativeNode)(nodes: List[Node])(using
  Environment): F[Unit] =
    nodes
      .map(CanConvertNode[F].convertNode)
      .map(_ >>= CanAppendChild[F].appendChild(parent))
      .sequence >> Sync[F].unit

}
