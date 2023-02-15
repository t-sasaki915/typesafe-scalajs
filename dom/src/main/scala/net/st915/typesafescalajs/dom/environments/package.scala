package net.st915.typesafescalajs.dom

package object environments {

  given global: Environment =
    Environment(
      document = org.scalajs.dom.document,
      window = org.scalajs.dom.window
    )

}
