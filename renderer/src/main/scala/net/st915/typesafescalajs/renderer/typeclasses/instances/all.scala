package net.st915.typesafescalajs.renderer.typeclasses.instances

import cats.Monad
import cats.effect.Sync
import net.st915.typesafescalajs.renderer.typeclasses.*

trait all {

  given monadCanGetTagId[F[_]: Monad]: CanGetTagId[F] = MonadCanGetTagId[F]

  given syncCanCreateNativeElement[F[_]: Sync]: CanCreateNativeElement[F] =
    SyncCanCreateNativeElement[F]

  given syncCanCreateNativeTextNode[F[_]: Sync]: CanCreateNativeTextNode[F] =
    SyncCanCreateNativeTextNode[F]

  given syncCanAppendChild[F[_]: Sync]: CanAppendChild[F] =
    SyncCanAppendChild[F]

  given syncCanApplyAttribute[F[_]: Sync]: CanApplyAttribute[F] =
    SyncCanApplyAttribute[F]

  given syncCanApplyAttributes[F[_]: Sync]: CanApplyAttributes[F] =
    SyncCanApplyAttributes[F]

  given syncCanConvertNode[F[_]: Sync]: CanConvertNode[F] =
    SyncCanConvertNode[F]

}

object all extends all
