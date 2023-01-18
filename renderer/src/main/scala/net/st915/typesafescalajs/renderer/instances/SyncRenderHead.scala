package net.st915.typesafescalajs.renderer.instances

import cats.effect.Sync
import net.st915.typesafescalajs.dom.tags.Tag
import net.st915.typesafescalajs.dom.tags.special.Head
import net.st915.typesafescalajs.renderer.typeclasses.*
import net.st915.typesafescalajs.renderer.{Environment, RenderHead}

class SyncRenderHead[F[_]: Sync: CanApplyAttributes] extends RenderHead[F] {

  import cats.syntax.all.*

  override def renderHead(head: Head)(using Environment): F[Unit] =
    Sync[F].pure(summon[Environment].document.head) >>= { docHead =>
      CanApplyAttributes[F].applyAttributes(docHead)(head.attributes)
    }

}
