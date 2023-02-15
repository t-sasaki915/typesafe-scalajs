package net.st915.typesafescalajs.renderer

import net.st915.typesafescalajs.dom.Environment
import org.scalajs.dom.{HTMLDocument, HTMLElement, HTMLHeadElement}

package object util {

  def summonDocument(using Environment): HTMLDocument = summon[Environment].document

  def summonHead(using Environment): HTMLHeadElement = summonDocument.head

  def summonBody(using Environment): HTMLElement = summonDocument.body

}
