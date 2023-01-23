package net.st915.typesafescalajs.examples

import cats.effect.IO
import net.st915.typesafescalajs.dom.tags.special.{Body, Head}
import net.st915.typesafescalajs.renderer.HTMLApp

object Main extends HTMLApp {

  override val head: IO[Head] =
    IO(SimpleStaticPage.pageHead)

  override val body: IO[Body] =
    IO(SimpleStaticPage.pageBody)

}
