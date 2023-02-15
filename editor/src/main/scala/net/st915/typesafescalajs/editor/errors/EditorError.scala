package net.st915.typesafescalajs.editor.errors

object EditorError {

  final case class ElementNotFound(message: String) extends EditorError

}

sealed trait EditorError {

  val message: String

}
