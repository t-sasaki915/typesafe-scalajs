package net.st915.typesafescalajs.examples

import cats.effect.*

object Main extends IOApp {

  override def run(args: List[String]): IO[ExitCode] =
    simpleStaticPage

}
