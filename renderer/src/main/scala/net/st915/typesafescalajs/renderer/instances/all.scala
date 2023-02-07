package net.st915.typesafescalajs.renderer.instances

import cats.Monad
import cats.effect.Sync
import net.st915.typesafescalajs.renderer.typeclasses.*

trait all {

  given canAppendChild[F[_]: Sync]: CanAppendChild[F] =
    SyncCanAppendChild[F]

  given canAppendChildren[F[_]: Sync]: CanAppendChildren[F] =
    SyncCanAppendChildren[F]

  given canApplyAttribute[F[_]: Sync]: CanApplyAttribute[F] =
    SyncCanApplyAttribute[F]

  given canApplyAttributes[F[_]: Sync]: CanApplyAttributes[F] =
    SyncCanApplyAttributes[F]

  given canCreateNativeElement[F[_]: Sync]: CanCreateNativeElement[F] =
    SyncCanCreateNativeElement[F]

  given canCreateNativeTextNode[F[_]: Sync]: CanCreateNativeTextNode[F] =
    SyncCanCreateNativeTextNode[F]

  given canConvertNode[F[_]: Sync]: CanConvertNode[F] =
    SyncCanConvertNode[F]

  given canConvertNodes[F[_]: Sync]: CanConvertNodes[F] =
    SyncCanConvertNodes[F]

  given canRenderBody[F[_]: Sync]: CanRenderBody[F] =
    SyncCanRenderBody[F]

  given canRenderHead[F[_]: Sync]: CanRenderHead[F] =
    SyncCanRenderHead[F]

}

object all extends all
