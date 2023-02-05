package net.st915.typesafescalajs.renderer.instances

import cats.effect.Sync
import cats.effect.unsafe.IORuntime
import net.st915.typesafescalajs.dom.tags.Tag
import net.st915.typesafescalajs.dom.tags.special.Body
import net.st915.typesafescalajs.renderer.Environment
import net.st915.typesafescalajs.renderer.typeclasses.*
import net.st915.typesafescalajs.renderer.util.summonBody

class SyncCanRenderBody[F[_]: Sync: CanApplyAttributes: CanConvertNodes: CanAppendChildren]
    extends CanRenderBody[F] {

  import cats.syntax.all.*

  override def renderBody(body: Body)(using Environment, IORuntime): F[Unit] =
    CanApplyAttributes[F].applyAttributes(body.attributes).run(summonBody) >> {
      CanConvertNodes[F].convertNodes andThen
        CanAppendChildren[F].appendChildren(summonBody) run body.children
    } >> Sync[F].unit

}
