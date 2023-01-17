package net.st915.typesafescalajs.renderer.instances

import cats.effect.Sync
import net.st915.typesafescalajs.dom.tags.Tag
import net.st915.typesafescalajs.dom.tags.special.Head
import net.st915.typesafescalajs.renderer.typeclasses.*
import net.st915.typesafescalajs.renderer.{Environment, RenderHead}

class SyncRenderHead[F[_]: Sync: CanGetTagId] extends RenderHead[F] {

  import cats.syntax.all.*

  override def renderHead(head: Head)(using Environment): F[Unit] =
    head
      .childs
      .filter(_.isInstanceOf[Tag[_]])
      .map(_.asInstanceOf[Tag[_]])
      .map(CanGetTagId[F].getTagId)
      .map(_ >>= (tag => Sync[F].pure(println(tag))))
      .sequence >> Sync[F].unit

}
