package net.st915.typesafescalajsdom.events

import net.st915.typesafescalajsdom.NativeWindow
import net.st915.typesafescalajsdom.event.{Event, NativeUIEvent}
import net.st915.typesafescalajsdom.event.typeclasses.FromNativeEvent

object UIEvent {

  given FromNativeEvent[UIEvent, NativeUIEvent] with
    override def fromNativeEvent(native: NativeUIEvent): UIEvent = UIEvent(native)

}

final case class UIEvent(native: NativeUIEvent) extends Event(native) {

  def detail: Int = native.detail

  def view: NativeWindow = native.view

}
