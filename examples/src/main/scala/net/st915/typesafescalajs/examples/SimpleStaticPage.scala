package net.st915.typesafescalajs.examples

import cats.effect.*

def simpleStaticPage: IO[ExitCode] = {
  IO.println("TEST") >>
    IO(ExitCode.Success)
}
