package net.st915.typesafescalajs.renderer.instances

import cats.effect.Sync
import net.st915.typesafescalajs.renderer.{RenderBody, RenderHead, typeclasses}

trait all extends typeclasses.instances.all {

  given syncRenderHead[F[_]: Sync]: RenderHead[F] = SyncRenderHead[F]

  given syncRenderBody[F[_]: Sync]: RenderBody[F] = SyncRenderBody[F]

}

object all extends all
