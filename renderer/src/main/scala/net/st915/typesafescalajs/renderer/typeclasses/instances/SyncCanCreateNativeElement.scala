package net.st915.typesafescalajs.renderer.typeclasses.instances

import cats.effect.Sync
import net.st915.typesafescalajs.dom.tags.Tag
import net.st915.typesafescalajs.renderer.Environment
import net.st915.typesafescalajs.renderer.typeclasses.*
import org.scalajs.dom.HTMLElement

class SyncCanCreateNativeElement[F[_]: Sync: CanGetTagId] extends CanCreateNativeElement[F] {

  import cats.syntax.flatMap.*

  override def createNativeElement[A <: Tag[_]](original: A)(using Environment): F[HTMLElement] =
    CanGetTagId[F].getTagId(original) >>= { tagId =>
      Sync[F].pure {
        summon[Environment]
          .document
          .createElement(tagId)
          .asInstanceOf[HTMLElement]
      }
    }

}
