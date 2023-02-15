package net.st915.typesafescalajs.renderer.typeclasses

import cats.effect.unsafe.IORuntime
import net.st915.typesafescalajs.dom.Environment
import net.st915.typesafescalajs.dom.tags.Tags.Body

object CanRenderBody {

  def apply[F[_]](using CanRenderBody[F]): CanRenderBody[F] = summon

}

trait CanRenderBody[F[_]] {

  def renderBody(body: Body)(using Environment, IORuntime): F[Unit]

}
