package net.st915.typesafescalajs.renderer.typeclasses.instances

import cats.Monad
import cats.effect.Sync
import net.st915.typesafescalajs.renderer.typeclasses.*

trait all {

  given monadCanGetTagId[F[_]: Monad]: CanGetTagId[F] = MonadCanGetTagId[F]

  given syncCanCreateNativeElement[F[_]: Sync]: CanCreateNativeElement[F] =
    SyncCanCreateNativeElement[F]

  given syncCanAppendChild[F[_]: Sync]: CanAppendChild[F] =
    SyncCanAppendChild[F]

}

object all extends all
