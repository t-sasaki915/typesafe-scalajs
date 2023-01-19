package net.st915.typesafescalajs.renderer.typeclasses

import cats.data.Kleisli
import cats.effect.unsafe.IORuntime
import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.renderer.Environment
import net.st915.typesafescalajs.renderer.domain.typealiases.NativeNode

object CanConvertNodes {

  def apply[F[_]](using ev: CanConvertNodes[F]): CanConvertNodes[F] = ev

}

trait CanConvertNodes[F[_]] {

  def convertNodes(using Environment, IORuntime): Kleisli[F, List[Node], List[NativeNode]]

}
