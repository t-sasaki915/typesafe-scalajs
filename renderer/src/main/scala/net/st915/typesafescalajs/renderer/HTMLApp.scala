package net.st915.typesafescalajs.renderer

import cats.effect.*
import net.st915.typesafescalajs.dom.tags.special.{Body, Head}
import net.st915.typesafescalajs.renderer.{RenderBody, RenderHead}

trait HTMLApp extends IOApp {

  val head: Head
  val body: Body

  override def run(args: List[String]): IO[ExitCode] = {

    import cats.effect.unsafe.implicits.global
    import net.st915.typesafescalajs.renderer.environments.global
    import net.st915.typesafescalajs.renderer.instances.all.given

    RenderHead[IO].renderHead(head) >>
      RenderBody[IO].renderBody(body) >>
      IO(ExitCode.Success)

  } 

}
