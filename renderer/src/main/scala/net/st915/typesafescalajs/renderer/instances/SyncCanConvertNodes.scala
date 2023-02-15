package net.st915.typesafescalajs.renderer.instances

import cats.data.Kleisli
import cats.effect.Sync
import cats.effect.unsafe.IORuntime
import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.dom.Environment
import net.st915.typesafescalajs.renderer.domain.typealiases.NativeNode
import net.st915.typesafescalajs.renderer.typeclasses.*

final class SyncCanConvertNodes[F[_]: Sync: CanConvertNode] extends CanConvertNodes[F] {

  import cats.syntax.all.*

  override def convertNodes(
    using Environment,
    IORuntime
  ): Kleisli[F, List[Node], List[NativeNode]] =
    Kleisli { nodes =>
      nodes
        .map(CanConvertNode[F].convertNode.run)
        .sequence
    }

}
