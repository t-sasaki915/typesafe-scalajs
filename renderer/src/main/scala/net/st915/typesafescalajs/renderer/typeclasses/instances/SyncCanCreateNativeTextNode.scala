package net.st915.typesafescalajs.renderer.typeclasses.instances

import cats.effect.Sync
import net.st915.typesafescalajs.renderer.Environment
import net.st915.typesafescalajs.renderer.domain.typealiases.NativeTextNode
import net.st915.typesafescalajs.renderer.typeclasses.CanCreateNativeTextNode

class SyncCanCreateNativeTextNode[F[_]: Sync] extends CanCreateNativeTextNode[F] {

  override def createNativeTextNode(content: String)(using Environment): F[NativeTextNode] =
    Sync[F].blocking {
      summon[Environment].document.createTextNode(content)
    }

}
