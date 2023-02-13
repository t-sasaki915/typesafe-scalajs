package net.st915.typesafescalajs.app

import cats.effect.IO
import net.st915.typesafescalajs.dom.tags.Tags.{Body, Head}

trait HTMLApp extends HTMLIOApp {

  val head: Head
  val body: Body

  override final val headProgram: IO[Head] = IO(head)
  override final val bodyProgram: IO[Body] = IO(body)

}
