package net.st915.typesafescalajs.renderer

import net.st915.typesafescalajs.dom.tags.special.Head

object RenderHead {

  def apply[F[_]](using ev: RenderHead[F]): RenderHead[F] = ev

}

trait RenderHead[F[_]] {

  def renderHead(head: Head)(using Environment): F[Unit]

}
