package net.st915.typesafescalajs.renderertest

import cats.effect.*
import net.st915.typesafescalajs.renderer.Environment

object Main extends IOApp {

  import cats.syntax.flatMap.*
  import net.st915.typesafescalajs.dom.dsl.*

  import net.st915.typesafescalajs.renderer.environments.global

  private val head = Head(
    Title()("Test Page"),
    Meta(charset := "utf-8")
  )

  private val body = Body(
    H1() {
      "Title"
    },
    BR(),
    Paragraph(className := "text", id := "someId")(
      "Content Line 1",
      BR(),
      "Content Line 2"
    ),
    Button(className := "btn", onClick := (_ => IO(println("Clicked")))) {
      "Button"
    },
    Button(className := "disabledBtn", onClick := (_ => IO(println("???"))), disabled) {
      "Disabled Button"
    },
    Anchor(className := "anchor", href := "github.com") {
      "Anchor"
    }
  )

  def run(args: List[String]): IO[ExitCode] =
    IO.println(summon[Environment].document) >> IO(ExitCode.Success)

}
