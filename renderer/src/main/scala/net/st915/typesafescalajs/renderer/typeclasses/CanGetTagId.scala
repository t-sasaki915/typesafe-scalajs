package net.st915.typesafescalajs.renderer.typeclasses

import cats.data.Kleisli
import net.st915.typesafescalajs.dom.tags.Tag

object CanGetTagId {

  def apply[F[_]](using CanGetTagId[F]): CanGetTagId[F] = summon

}

trait CanGetTagId[F[_]] {

  def getTagId[A <: Tag[_]]: Kleisli[F, A, String]

}
