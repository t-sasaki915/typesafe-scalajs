package net.st915.typesafescalajs.examples

import net.st915.typesafescalajs.dom.tags.special.{Body, Head}
import net.st915.typesafescalajs.renderer.HTMLApp

object Main extends HTMLApp {

  override val head: Head =
    SimpleStaticPage.pageHead

  override val body: Body =
    SimpleStaticPage.pageBody

}
