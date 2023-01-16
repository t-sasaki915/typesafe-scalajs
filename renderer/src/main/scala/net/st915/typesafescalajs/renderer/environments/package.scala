package net.st915.typesafescalajs.renderer

import net.st915.typesafescalajs.renderer.Environment

package object environments {

  given global: Environment = Environment(org.scalajs.dom.document, org.scalajs.dom.window)

}
