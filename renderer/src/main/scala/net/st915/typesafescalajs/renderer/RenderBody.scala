package net.st915.typesafescalajs.renderer

import net.st915.typesafescalajs.dom.tags.special.Body

object RenderBody {

  def apply[F[_]](using ev: RenderBody[F]): RenderBody[F] = ev

}

trait RenderBody[F[_]] {

  def renderBody(body: Body)(using Environment): F[Unit]

}
