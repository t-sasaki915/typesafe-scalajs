package net.st915.typesafescalajs.dom

import org.scalajs.dom.{HTMLDocument, Window}

final case class Environment(document: HTMLDocument, window: Window)
