package net.st915.typesafescalajs.renderer.typeclasses

import cats.effect.unsafe.IORuntime
import net.st915.typesafescalajs.dom.tags.special.Head
import net.st915.typesafescalajs.renderer.Environment

object CanRenderHead {

  def apply[F[_]](using ev: CanRenderHead[F]): CanRenderHead[F] = ev

}

trait CanRenderHead[F[_]] {

  def renderHead(head: Head)(using Environment, IORuntime): F[Unit]

}
