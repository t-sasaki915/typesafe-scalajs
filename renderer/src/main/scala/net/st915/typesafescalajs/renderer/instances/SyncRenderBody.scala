package net.st915.typesafescalajs.renderer.instances

import cats.effect.Sync
import net.st915.typesafescalajs.dom.tags.Tag
import net.st915.typesafescalajs.dom.tags.special.Body
import net.st915.typesafescalajs.renderer.typeclasses.*
import net.st915.typesafescalajs.renderer.{Environment, RenderBody}

class SyncRenderBody[F[_]: Sync: CanApplyAttributes] extends RenderBody[F] {

  import cats.syntax.all.*

  override def renderBody(body: Body)(using Environment): F[Unit] =
    Sync[F].pure(summon[Environment].document.body) >>= { docBody =>
      CanApplyAttributes[F].applyAttributes(docBody)(body.attributes)
    }

}
