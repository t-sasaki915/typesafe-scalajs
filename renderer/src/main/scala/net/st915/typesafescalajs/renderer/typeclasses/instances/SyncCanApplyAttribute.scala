package net.st915.typesafescalajs.renderer.typeclasses.instances

import cats.effect.Sync
import net.st915.typesafescalajs.dom.attributes.Attribute
import net.st915.typesafescalajs.renderer.typeclasses.CanApplyAttribute
import org.scalajs.dom.HTMLElement

class SyncCanApplyAttribute[F[_]: Sync] extends CanApplyAttribute[F] {

  import net.st915.typesafescalajs.dom.attributes.global.*

  override def applyAttribute[A <: HTMLElement, B](element: A)(attribute: (_, B)): F[Unit] =
    Sync[F].blocking {
      (attribute._1.asInstanceOf[Attribute[B]], attribute._2) match
        case (_: accessKey.type, value: String) =>
          element.accessKey = value
        case (_: className.type, value: String) =>
          element.className = value
        case (_: contentEditable.type, value: Boolean) =>
          element.contentEditable = if (value) "true" else "false"
        case (_: dir.type, value: String) =>
          element.dir = value
        case (_: draggable.type, value: Boolean) =>
          element.draggable = value
        case (_: id.type, value: String) =>
          element.id = value
        case (_: lang.type, value: String) =>
          element.lang = value
        case (_: spellCheck.type, value: Boolean) =>
          element.spellcheck = value
        case (_: style.type, value: String) =>
          element.style = value
        case (_: tabIndex.type, value: Int) =>
          element.tabIndex = value
        case (_: title.type, value: String) =>
          element.title = value
        case (attr, _) =>
          println(s"Ignoring attribute '$attr'.")
    }

}
