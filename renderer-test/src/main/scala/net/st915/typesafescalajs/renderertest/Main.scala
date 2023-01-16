package net.st915.typesafescalajs.renderertest

import cats.effect.*
import net.st915.typesafescalajs.renderer.Environment

object Main extends IOApp {

  import cats.syntax.flatMap.*

  import net.st915.typesafescalajs.renderer.environments.global

  def run(args: List[String]): IO[ExitCode] =
    IO.println(summon[Environment].document) >> IO(ExitCode.Success)

}
