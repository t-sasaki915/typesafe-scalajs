# typesafe-scalajs
Typesafe Scala.js

# Try Example Code
```bash
docker build -t typesafe-scalajs-example .
docker run -p "8080:80" typesafe-scalajs-example
```

# Usage

## build.sbt
```scala
libraryDependencies ++= Seq(
  "net.st915" %%% "typesafe-scalajs-app" % "VERSION"
)
```

## DOM DSL
```scala
import net.st915.typesafescalajs.dom.dsl.*
```

#### Create Element
```scala
val emptyParagraph = Paragraph()
val emptyDiv = Div()
val emptyButton = Button()
```

#### Create Element with attributes
```scala
val paragraphWithId =
  Paragraph(id := "text")
val divWithClassName =
  Div(className := "container")
val disabledButtonWithClickEvent =
  Button(onClick := (_ => IO(println("clicked"))), disabled)
```

#### Create Element with children
```scala
val paragraphWithTextNode =
  Paragraph {
    "Text"
  }
val divWithThreeChildren =
  Div(
    Div(className := "child"),
    Div(className := "child"),
    Div(className := "child")
  )
val buttonWithTextNode =
  Button {
    "Button"
  }
```

#### Create Element with attributes and children
```scala
val paragraphWithIdAndTextNode =
  Paragraph(id := "text") {
    "Text"
  }
val divWithClassNameAndThreeChildren =
  Div(className := "container")(
    Div(className := "child") {
      "Line 1"
    },
    Div(className := "child") {
      "Line 2"
    },
    Div(className := "child") {
      "Line 3"
    }
  )
val disabledButtonWithClickEventAndTextNode =
  Button(onClick := (_ => IO(println("???"))), disabled) {
    "Disabled Button"
  }
```

#### Create Head Element
```scala
val headWithTitle =
  Head {
    Title {
      "Page Title"
    }
  }
```

#### Create Body Element
```scala
val bodyWithThreeChildren =
  Body(
    Div(className := "child"),
    Div(className := "child"),
    Div(className := "child")
  )
```

#### Implicit Conversions

##### Implicit Conversion of String
```scala
Span(
  "ABC",
  Span {
    "DEF"
  }
)
```
This will be:
```scala
Span(
  TextNode("ABC"),
  Span {
    TextNode("DEF")
  }
)
```

##### Implicit Conversion of [FlagAttribute](https://github.com/stouma915/typesafe-scalajs/blob/main/dom/src/main/scala/net/st915/typesafescalajs/dom/attributes/FlagAttribute.scala) (e.g. `async` `disabled` `autoPlay`)
```scala
Script(src := "aaa.js", async)
Button(id := "btn", disabled)
Audio(autoPlay)
```
This will be:
```scala
Script(src := "aaa.js", async := true)
Button(id := "btn", disabled := true)
Audio(autoPlay := true)
```

##### Implicit Conversion of [AllowEmptyAttribute](https://github.com/stouma915/typesafe-scalajs/blob/main/dom/src/main/scala/net/st915/typesafescalajs/dom/attributes/AllowEmptyAttribute.scala) (e.g. `sandbox`)
```scala
IFrame(src := "aaa.html", sandbox)
```
This will be:
```scala
IFrame(src := "aaa.html", sandbox := Set())
```

## App

#### HTMLApp
```scala
import cats.effect.IO
import net.st915.typesafescalajs.app.HTMLApp

object Main extends HTMLApp {

  import net.st915.typesafescalajs.dom.dsl.*

  override val head: Head = ???

  override val body: Body = ???

  override val beforeRender: IO[Unit] = IO(???) // optional
  
  override val afterRender: IO[Unit] = IO(???) // optional

}
```

#### HTMLIOApp
```scala
import cats.effect.IO
import net.st915.typesafescalajs.app.HTMLIOApp

object Main extends HTMLIOApp {

  import net.st915.typesafescalajs.dom.dsl.*

  override val headProgram: IO[Head] = IO(???)

  override val bodyProgram: IO[Body] = IO(???)
  
  override val beforeRender: IO[Unit] = IO(???) // optional

  override val afterRender: IO[Unit] = IO(???) // optional

}
```
