package net.st915.typesafescalajsdom.event

import cats.effect.IO

class Event(native: NativeEvent) {

  def timeStamp: Double = native.timeStamp

  def defaultPrevented: Boolean = native.defaultPrevented

  def isTrusted: Boolean = native.isTrusted

  def currentTarget: NativeEventTarget = native.currentTarget

  def cancelBubble: Boolean = native.cancelBubble

  def target: NativeEventTarget = native.target

  def eventPhase: Int = native.eventPhase

  def cancelable: Boolean = native.cancelable

  def `type`: String = native.`type`

  def bubbles: Boolean = native.bubbles

  def stopPropagation: IO[Unit] = IO(native.stopPropagation())

  def stopImmediatePropagation: IO[Unit] = IO(native.stopImmediatePropagation())

  def preventDefault: IO[Unit] = IO(native.preventDefault())

}
