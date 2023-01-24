package net.st915.typesafescalajs.renderer.instances

import cats.data.Kleisli
import cats.effect.Sync
import net.st915.typesafescalajs.renderer.domain.typealiases.NativeNode
import net.st915.typesafescalajs.renderer.typeclasses.CanAppendChild

import scala.util.chaining.*

class SyncCanAppendChild[F[_]: Sync] extends CanAppendChild[F] {

  override def appendChild[A <: NativeNode, B <: NativeNode](parent: A): Kleisli[F, B, A] =
    Kleisli { child => Sync[F].blocking(parent.tap(_.appendChild(child))) }

}
