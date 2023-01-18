package net.st915.typesafescalajs.renderer.typeclasses.instances

import cats.effect.Sync
import net.st915.typesafescalajs.renderer.domain.typealiases.NativeNode
import net.st915.typesafescalajs.renderer.typeclasses.CanAppendChild

class SyncCanAppendChild[F[_]: Sync] extends CanAppendChild[F] {

  override def appendChild(parent: NativeNode)(child: NativeNode): F[Unit] =
    Sync[F].blocking {
      parent.appendChild(child)
    }

}
