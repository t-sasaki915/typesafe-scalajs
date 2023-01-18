package net.st915.typesafescalajs.renderer.typeclasses

import net.st915.typesafescalajs.renderer.domain.typealiases.NativeNode

object CanAppendChild {

  def apply[F[_]](using ev: CanAppendChild[F]): CanAppendChild[F] = ev

}

trait CanAppendChild[F[_]] {

  def appendChild(parent: NativeNode)(child: NativeNode): F[Unit]

}
