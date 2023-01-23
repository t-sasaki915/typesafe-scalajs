# typesafe-scalajs
Typesafe scalajs

# Example
```scala
import cats.effect.*
import net.st915.typesafescalajs.renderer.{RenderBody, RenderHead}

object Main extends IOApp {

  import cats.syntax.all.*

  override def run(args: List[String]): IO[ExitCode] = {

    import net.st915.typesafescalajs.dom.dsl.*

    import cats.effect.unsafe.implicits.global
    import net.st915.typesafescalajs.renderer.environments.global
    import net.st915.typesafescalajs.renderer.instances.all.given

    val head = Head(
      Title() {
        "Simple Page"
      }
    )

    val body = Body(
      H1() {
        "Page Title"
      },
      Paragraph(className := "content") {
        "Page Content"
      },
      Button(onClick := (_ => IO.println("clicked"))) {
        "Clickable Button"
      }
    )

    RenderHead.renderHead[IO](head) >>
      RenderBody.renderBody[IO](body) >>
      IO(ExitCode.Success)

  }

}
```
