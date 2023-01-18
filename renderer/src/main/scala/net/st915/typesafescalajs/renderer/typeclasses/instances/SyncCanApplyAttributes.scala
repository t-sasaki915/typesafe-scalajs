package net.st915.typesafescalajs.renderer.typeclasses.instances

import cats.data.Kleisli
import cats.effect.Sync
import net.st915.typesafescalajs.renderer.typeclasses.*
import org.scalajs.dom.HTMLElement

class SyncCanApplyAttributes[F[_]: Sync: CanApplyAttribute] extends CanApplyAttributes[F] {

  import cats.syntax.all.*

  override def applyAttributes[A <: HTMLElement, B, C](attributes: Set[(B, C)]): Kleisli[F, A, A] =
    Kleisli { nativeElem =>
      attributes
        .toList
        .foldLeftM(nativeElem) { (acc, attr) => CanApplyAttribute[F].applyAttribute(attr) run acc }
    }

}
