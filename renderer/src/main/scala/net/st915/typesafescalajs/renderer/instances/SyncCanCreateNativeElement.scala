package net.st915.typesafescalajs.renderer.instances

import cats.data.Kleisli
import cats.effect.Sync
import net.st915.typesafescalajs.dom.tags.Tag
import net.st915.typesafescalajs.renderer.Environment
import net.st915.typesafescalajs.renderer.typeclasses.*
import net.st915.typesafescalajs.renderer.util.summonDocument
import org.scalajs.dom.HTMLElement

final class SyncCanCreateNativeElement[F[_]: Sync: CanGetTagId] extends CanCreateNativeElement[F] {

  import cats.syntax.flatMap.*

  private def createElementById(using Environment): Kleisli[F, String, HTMLElement] =
    Kleisli { tagId =>
      Sync[F].blocking {
        summonDocument
          .createElement(tagId)
          .asInstanceOf[HTMLElement]
      }
    }

  override def createNativeElement[A <: Tag[_]](using Environment): Kleisli[F, A, HTMLElement] =
    CanGetTagId[F].getTagId andThen createElementById

}
