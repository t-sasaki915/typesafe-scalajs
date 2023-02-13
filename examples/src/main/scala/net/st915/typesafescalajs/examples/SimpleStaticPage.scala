package net.st915.typesafescalajs.examples

import cats.effect.IO
import net.st915.typesafescalajs.app.HTMLApp

class SimpleStaticPage extends HTMLApp {

  import net.st915.typesafescalajs.dom.dsl.*

  override val head: Head =
    Head(
      Title("SimpleStaticPage"),
      Meta(charset := "utf-8")
    )

  override val body: Body =
    Body(
      H1 {
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
        "Go to GitHub"
      }
    )

}
