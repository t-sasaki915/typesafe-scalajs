package net.st915.typesafescalajs.renderer.typeclasses.instances

import cats.effect.Sync
import net.st915.typesafescalajs.renderer.typeclasses.CanAppendChild
import org.scalajs.dom.HTMLElement

class SyncCanAppendChild[F[_]: Sync] extends CanAppendChild[F] {

  override def appendChild[A <: HTMLElement, B <: HTMLElement](child: A)(parent: B): F[Unit] =
    Sync[F].blocking {
      parent.appendChild(child)
    }

}
