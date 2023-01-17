package net.st915.typesafescalajs.renderer.instances

import cats.effect.Sync
import net.st915.typesafescalajs.dom.tags.Tag
import net.st915.typesafescalajs.dom.tags.special.Body
import net.st915.typesafescalajs.renderer.typeclasses.*
import net.st915.typesafescalajs.renderer.{Environment, RenderBody}

class SyncRenderBody[F[_]: Sync: CanGetTagId] extends RenderBody[F] {

  import cats.syntax.all.*

  override def renderBody(body: Body)(using Environment): F[Unit] =
    body
      .childs
      .filter(_.isInstanceOf[Tag[_]])
      .map(_.asInstanceOf[Tag[_]])
      .map(CanGetTagId[F].getTagId)
      .map(_ >>= (tag => Sync[F].pure(println(tag))))
      .sequence >> Sync[F].unit

}
