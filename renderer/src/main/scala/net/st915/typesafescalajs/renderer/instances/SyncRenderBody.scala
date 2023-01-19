package net.st915.typesafescalajs.renderer.instances

import cats.effect.Sync
import cats.effect.unsafe.IORuntime
import net.st915.typesafescalajs.dom.tags.Tag
import net.st915.typesafescalajs.dom.tags.special.Body
import net.st915.typesafescalajs.renderer.typeclasses.*
import net.st915.typesafescalajs.renderer.util.summonBody
import net.st915.typesafescalajs.renderer.{Environment, RenderBody}

class SyncRenderBody[F[_]: Sync: CanApplyAttributes: CanConvertNodes: CanAppendChilds]
    extends RenderBody[F] {

  import cats.syntax.all.*

  override def renderBody(body: Body)(using Environment, IORuntime): F[Unit] =
    CanApplyAttributes[F].applyAttributes(body.attributes).run(summonBody) >> {
      CanConvertNodes[F].convertNodes andThen
        CanAppendChilds[F].appendChilds(summonBody) run body.childs
    } >> Sync[F].unit

}
