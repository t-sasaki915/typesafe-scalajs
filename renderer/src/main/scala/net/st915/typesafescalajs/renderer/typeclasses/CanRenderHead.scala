package net.st915.typesafescalajs.renderer.typeclasses

import cats.effect.unsafe.IORuntime
import net.st915.typesafescalajs.dom.Environment
import net.st915.typesafescalajs.dom.tags.Tags.Head

object CanRenderHead {

  def apply[F[_]](using CanRenderHead[F]): CanRenderHead[F] = summon

}

trait CanRenderHead[F[_]] {

  def renderHead(head: Head)(using Environment, IORuntime): F[Unit]

}
