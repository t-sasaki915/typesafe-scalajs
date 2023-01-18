package net.st915.typesafescalajs.renderer.typeclasses

import cats.data.Kleisli
import net.st915.typesafescalajs.renderer.Environment
import net.st915.typesafescalajs.renderer.domain.typealiases.NativeTextNode

object CanCreateNativeTextNode {

  def apply[F[_]](using ev: CanCreateNativeTextNode[F]): CanCreateNativeTextNode[F] = ev

}

trait CanCreateNativeTextNode[F[_]] {

  def createNativeTextNode(using Environment): Kleisli[F, String, NativeTextNode]

}
