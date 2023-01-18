package net.st915.typesafescalajs.renderer.typeclasses.instances

import cats.Monad
import cats.effect.Sync
import net.st915.typesafescalajs.renderer.typeclasses.*

trait all {

  given canGetTagId[F[_]: Monad]: CanGetTagId[F] = MonadCanGetTagId[F]

  given canAppendChild[F[_]: Sync]: CanAppendChild[F] =
    SyncCanAppendChild[F]

  given canAppendChilds[F[_]: Sync]: CanAppendChilds[F] =
    SyncCanAppendChilds[F]

  given canApplyAttribute[F[_]: Sync]: CanApplyAttribute[F] =
    SyncCanApplyAttribute[F]

  given canApplyAttributes[F[_]: Sync]: CanApplyAttributes[F] =
    SyncCanApplyAttributes[F]

  given syncCanCreateNativeElement[F[_]: Sync]: CanCreateNativeElement[F] =
    SyncCanCreateNativeElement[F]

  given syncCanCreateNativeTextNode[F[_]: Sync]: CanCreateNativeTextNode[F] =
    SyncCanCreateNativeTextNode[F]

  given syncCanConvertNode[F[_]: Sync]: CanConvertNode[F] =
    SyncCanConvertNode[F]

  given syncCanConvertNodes[F[_]: Sync]: CanConvertNodes[F] =
    SyncCanConvertNodes[F]

}

object all extends all
