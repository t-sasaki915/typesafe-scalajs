package net.st915.typesafescalajs.renderer

import cats.effect.unsafe.IORuntime
import net.st915.typesafescalajs.dom.tags.special.Head

object RenderHead {

  def apply[F[_]](using ev: RenderHead[F]): RenderHead[F] = ev

}

trait RenderHead[F[_]] {

  def renderHead(head: Head)(using Environment, IORuntime): F[Unit]

}
