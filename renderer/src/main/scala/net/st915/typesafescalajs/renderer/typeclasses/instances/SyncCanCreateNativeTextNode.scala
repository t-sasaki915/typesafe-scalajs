package net.st915.typesafescalajs.renderer.typeclasses.instances

import cats.data.Kleisli
import cats.effect.Sync
import net.st915.typesafescalajs.renderer.Environment
import net.st915.typesafescalajs.renderer.domain.typealiases.NativeTextNode
import net.st915.typesafescalajs.renderer.typeclasses.CanCreateNativeTextNode
import net.st915.typesafescalajs.renderer.util.summonDocument

class SyncCanCreateNativeTextNode[F[_]: Sync] extends CanCreateNativeTextNode[F] {

  override def createNativeTextNode(using Environment): Kleisli[F, String, NativeTextNode] =
    Kleisli { content => Sync[F].blocking(summonDocument.createTextNode(content)) }

}
