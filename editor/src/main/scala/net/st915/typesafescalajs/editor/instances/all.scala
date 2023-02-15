package net.st915.typesafescalajs.editor.instances

import cats.effect.Sync
import net.st915.typesafescalajs.editor.typeclasses.*

trait all {

  given canGetNativeElementById[F[_]: Sync]: CanGetNativeElementById[F] =
    SyncCanGetNativeElementById[F]

}

object all extends all
