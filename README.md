# typesafe-scalajs
Typesafe scalajs

# Try Example Code
```bash
docker build -t typesafe-scalajs-example .
docker start -p "8080:80" typesafe-scalajs-example
```

# Examples
* [index.html](https://github.com/stouma915/typesafe-scalajs/blob/main/examples/src/main/resources/index.html)
* [SimpleStaticPage.scala](https://github.com/stouma915/typesafe-scalajs/blob/main/examples/src/main/scala/net/st915/typesafescalajs/examples/SimpleStaticPage.scala)

# Usage
## DOM DSL
```scala
import net.st915.typesafescalajs.dom.dsl.*
```

#### Create Element
```scala
Paragraph()
Div()
Button()
```

#### Create Element with attributes
```scala
Paragraph(id := "text")
Div(className := "container")
Button(onClick := (_ => IO(println("clicked"))), disabled)
```

#### Create Element with childs
```scala
Paragraph() {
  "Text" // or TextNode("Text")
}
Div()(
  Div(className := "child"),
  Div(className := "child"),
  Div(className := "child")
)
Button() {
  "Button"
}
```

#### Create Element with attributes and childs
```scala
Paragraph(id := "text") {
  "Text"
}
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
Button(onClick := (_ => IO(println("???"))), disabled) {
  "Disabled Button"
}
```
