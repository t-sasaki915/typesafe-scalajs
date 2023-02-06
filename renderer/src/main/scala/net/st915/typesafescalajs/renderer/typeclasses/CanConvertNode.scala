package net.st915.typesafescalajs.renderer.typeclasses

import cats.data.Kleisli
import cats.effect.unsafe.IORuntime
import net.st915.typesafescalajs.Node
import net.st915.typesafescalajs.renderer.Environment
import net.st915.typesafescalajs.renderer.domain.typealiases.NativeNode

object CanConvertNode {

  def apply[F[_]](using CanConvertNode[F]): CanConvertNode[F] = summon

}

trait CanConvertNode[F[_]] {

  def convertNode(using Environment, IORuntime): Kleisli[F, Node, NativeNode]

}
