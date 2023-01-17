package net.st915.typesafescalajs.renderer

import net.st915.typesafescalajs.renderer.Environment

package object environments {

  given global: Environment =
    Environment(
      document = org.scalajs.dom.document,
      window = org.scalajs.dom.window
    )

}
