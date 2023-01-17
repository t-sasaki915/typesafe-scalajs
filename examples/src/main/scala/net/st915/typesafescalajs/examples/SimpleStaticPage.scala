package net.st915.typesafescalajs.examples

import cats.effect.*
import net.st915.typesafescalajs.renderer.{RenderBody, RenderHead}

object SimpleStaticPage {

  val run: IO[ExitCode] = {

    import cats.syntax.all.*
    import net.st915.typesafescalajs.dom.dsl.*

    import net.st915.typesafescalajs.renderer.environments.global
    import net.st915.typesafescalajs.renderer.instances.all.given

    val head = Head(
      Title()("SimpleStaticPage"),
      Meta(charset := "utf-8")
    )

    val body = Body(
      H1() {
        "Simple Static Page Example"
      },
      BR(),
      Paragraph(className := "content")(
        "Content Line 1",
        BR(),
        "Content Line 2"
      ),
      Div(className := "buttons")(
        Button(className := "btn", onClick := (_ => IO(println("Clicked")))) {
          "Clickable Button"
        },
        BR(),
        Button(className := "btn", onClick := (_ => IO(println("????"))), disabled) {
          "Disabled Button"
        }
      ),
      BR(),
      Anchor(className := "link", href := "https://github.com") {
        "Link to github.com"
      }
    )

    RenderHead[IO].renderHead(head) >>
      RenderBody[IO].renderBody(body) >>
      IO(ExitCode.Success)

  }

}
