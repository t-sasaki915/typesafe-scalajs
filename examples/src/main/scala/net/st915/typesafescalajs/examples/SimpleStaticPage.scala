package net.st915.typesafescalajs.examples

import cats.effect.*

object SimpleStaticPage {

  val run: IO[ExitCode] = {

    import cats.syntax.all.*
    import net.st915.typesafescalajs.dom.dsl.*

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

    IO(ExitCode.Success)

  }

}
