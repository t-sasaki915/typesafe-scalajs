package net.st915.typesafescalajs.renderer.typeclasses.instances

import cats.data.Kleisli
import cats.effect.Sync
import net.st915.typesafescalajs.renderer.domain.typealiases.NativeNode
import net.st915.typesafescalajs.renderer.typeclasses.*

class SyncCanAppendChilds[F[_]: Sync: CanAppendChild] extends CanAppendChilds[F] {

  import cats.syntax.all.*

  override def appendChilds[A <: NativeNode, B <: NativeNode](parent: A): Kleisli[F, List[B], A] =
    Kleisli { childs =>
      childs.foldLeftM(parent) { (acc, child) => CanAppendChild[F].appendChild(acc) run child }
    }

}
