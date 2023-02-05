package net.st915.typesafescalajs.renderer.instances

import cats.effect.Sync
import cats.effect.unsafe.IORuntime
import net.st915.typesafescalajs.dom.tags.Tag
import net.st915.typesafescalajs.dom.tags.special.Head
import net.st915.typesafescalajs.renderer.Environment
import net.st915.typesafescalajs.renderer.typeclasses.*
import net.st915.typesafescalajs.renderer.util.summonHead

class SyncCanRenderHead[F[_]: Sync: CanApplyAttributes: CanConvertNodes: CanAppendChildren]
    extends CanRenderHead[F] {

  import cats.syntax.all.*

  override def renderHead(head: Head)(using Environment, IORuntime): F[Unit] = {
    CanApplyAttributes[F].applyAttributes(head.attributes).run(summonHead) >> {
      CanConvertNodes[F].convertNodes andThen
        CanAppendChildren[F].appendChildren(summonHead) run head.children
    }
  } >> Sync[F].unit

}
