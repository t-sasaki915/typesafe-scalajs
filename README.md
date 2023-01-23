# typesafe-scalajs
Typesafe scalajs

# Try Example Code
```bash
docker build -t typesafe-scalajs-example .
docker start -p "8080:80" typesafe-scalajs-example
```

# Examples
* [index.html](https://github.com/stouma915/typesafe-scalajs/blob/main/examples/src/main/resources/index.html)
```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <script src="./main.js"></script>
  </head>
  <body>
  </body>
</html>
```
* [SimpleStaticPage.scala](https://github.com/stouma915/typesafe-scalajs/blob/main/examples/src/main/scala/net/st915/typesafescalajs/examples/SimpleStaticPage.scala)
```scala
import cats.effect.*
import net.st915.typesafescalajs.renderer.{RenderBody, RenderHead}

object SimpleStaticPage extends IOApp {

  override def run(args: List[String]): IO[ExitCode] = {

    import cats.syntax.all.*
    import net.st915.typesafescalajs.dom.dsl.*

    import cats.effect.unsafe.implicits.global
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
```
