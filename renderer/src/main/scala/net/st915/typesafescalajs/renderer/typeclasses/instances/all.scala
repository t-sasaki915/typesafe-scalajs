package net.st915.typesafescalajs.renderer.typeclasses.instances

import cats.Monad
import net.st915.typesafescalajs.renderer.typeclasses.*

trait all {

  given monadCanGetTagId[F[_]: Monad]: CanGetTagId[F] = MonadCanGetTagId[F]

}

object all extends all
