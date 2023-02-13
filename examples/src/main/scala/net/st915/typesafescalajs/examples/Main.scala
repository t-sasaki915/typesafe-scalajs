package net.st915.typesafescalajs.examples

import cats.effect.IO
import net.st915.typesafescalajs.dom.tags.Tags.{Body, Head}
import net.st915.typesafescalajs.renderer.HTMLApp

object Main extends HTMLApp {

  override val headProgram: IO[Head] =
    IO(SimpleStaticPage.pageHead)

  override val bodyProgram: IO[Body] =
    IO(SimpleStaticPage.pageBody)

}
