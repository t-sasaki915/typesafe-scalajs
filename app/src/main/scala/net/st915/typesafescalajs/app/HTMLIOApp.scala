package net.st915.typesafescalajs.app

import cats.effect.*
import net.st915.typesafescalajs.dom.tags.Tags.{Body, Head}
import net.st915.typesafescalajs.renderer.typeclasses.{CanRenderBody, CanRenderHead}

trait HTMLIOApp extends IOApp {

  val headProgram: IO[Head]
  val bodyProgram: IO[Body]

  val beforeRender: IO[Unit] = IO.unit
  val afterRender: IO[Unit] = IO.unit

  override final def run(args: List[String]): IO[ExitCode] = {

    import cats.effect.unsafe.implicits.global
    import net.st915.typesafescalajs.dom.environments.global
    import net.st915.typesafescalajs.renderer.instances.all.given

    for {
      _ <- beforeRender
      head <- headProgram
      body <- bodyProgram
      _ <- CanRenderHead[IO].renderHead(head)
      _ <- CanRenderBody[IO].renderBody(body)
      _ <- afterRender
    } yield ExitCode.Success

  }

}
