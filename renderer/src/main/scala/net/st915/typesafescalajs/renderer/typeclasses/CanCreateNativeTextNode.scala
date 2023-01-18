package net.st915.typesafescalajs.renderer.typeclasses

import net.st915.typesafescalajs.renderer.Environment
import net.st915.typesafescalajs.renderer.domain.typealiases.NativeTextNode

object CanCreateNativeTextNode {

  def apply[F[_]](using ev: CanCreateNativeTextNode[F]): CanCreateNativeTextNode[F] = ev

}

trait CanCreateNativeTextNode[F[_]] {

  def createNativeTextNode(content: String)(using Environment): F[NativeTextNode]

}
