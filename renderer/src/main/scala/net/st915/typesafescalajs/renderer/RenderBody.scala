package net.st915.typesafescalajs.renderer

import cats.effect.unsafe.IORuntime
import net.st915.typesafescalajs.dom.tags.special.Body

object RenderBody {

  def apply[F[_]](using ev: RenderBody[F]): RenderBody[F] = ev

}

trait RenderBody[F[_]] {

  def renderBody(body: Body)(using Environment, IORuntime): F[Unit]

}
