package net.st915.typesafescalajs.renderer.instances

import cats.data.Kleisli
import cats.effect.Sync
import net.st915.typesafescalajs.dom.Environment
import net.st915.typesafescalajs.dom.tags.Tag
import net.st915.typesafescalajs.renderer.typeclasses.CanCreateNativeElement
import net.st915.typesafescalajs.renderer.util.summonDocument
import org.scalajs.dom.HTMLElement

final class SyncCanCreateNativeElement[F[_]: Sync] extends CanCreateNativeElement[F] {

  import cats.syntax.flatMap.*

  override def createNativeElement[A <: Tag[_]](using Environment): Kleisli[F, A, HTMLElement] =
    Kleisli { original =>
      Sync[F].blocking {
        summonDocument
          .createElement(original.tagName)
          .asInstanceOf[HTMLElement]
      }
    }

}
