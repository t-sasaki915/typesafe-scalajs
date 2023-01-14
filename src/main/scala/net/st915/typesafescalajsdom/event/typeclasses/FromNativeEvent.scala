package net.st915.typesafescalajsdom.event.typeclasses

object FromNativeEvent {

  def apply[A, B](using ev: FromNativeEvent[A, B]): FromNativeEvent[A, B] = ev

}

trait FromNativeEvent[A, B] {

  def fromNativeEvent(native: B): A

}
