package net.st915.typesafescalajs.renderer.instances

import cats.data.Kleisli
import cats.effect.Sync
import cats.effect.unsafe.IORuntime
import net.st915.typesafescalajs.renderer.typeclasses.*
import org.scalajs.dom.HTMLElement

final class SyncCanApplyAttributes[F[_]: Sync: CanApplyAttribute] extends CanApplyAttributes[F] {

  import cats.syntax.all.*

  override def applyAttributes[A <: HTMLElement, B, C](attributes: Set[(B, C)])(using
  IORuntime): Kleisli[F, A, A] =
    Kleisli { nativeElem =>
      attributes
        .toList
        .foldLeftM(nativeElem) { (acc, attr) => CanApplyAttribute[F].applyAttribute(attr) run acc }
    }

}
