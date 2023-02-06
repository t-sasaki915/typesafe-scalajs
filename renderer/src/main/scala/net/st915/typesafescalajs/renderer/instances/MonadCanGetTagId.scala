package net.st915.typesafescalajs.renderer.instances

import cats.Monad
import cats.data.Kleisli
import net.st915.typesafescalajs.dom.tags.Tag
import net.st915.typesafescalajs.renderer.typeclasses.CanGetTagId

final class MonadCanGetTagId[F[_]: Monad] extends CanGetTagId[F] {

  import net.st915.typesafescalajs.dom.tags.all.*

  override def getTagId[A <: Tag[_]]: Kleisli[F, A, String] =
    Kleisli { original =>
      Monad[F].pure {
        original match
          case _: Anchor       => "a"
          case _: Area         => "area"
          case _: Audio        => "audio"
          case _: BR           => "br"
          case _: Base         => "base"
          case _: Button       => "button"
          case _: Canvas       => "canvas"
          case _: Dialog       => "dialog"
          case _: Div          => "div"
          case _: Embed        => "embed"
          case _: FieldSet     => "fieldset"
          case _: Form         => "form"
          case _: H1           => "h1"
          case _: H2           => "h2"
          case _: H3           => "h3"
          case _: H4           => "h4"
          case _: H5           => "h5"
          case _: H6           => "h6"
          case _: HR           => "hr"
          case _: HTMLMap      => "map"
          case _: HTMLObject   => "object"
          case _: HTMLOption   => "option"
          case _: IFrame       => "iframe"
          case _: Image        => "img"
          case _: Input        => "input"
          case _: Link         => "link"
          case _: LI           => "li"
          case _: Label        => "label"
          case _: Legend       => "legend"
          case _: Menu         => "menu"
          case _: Meta         => "meta"
          case _: OList        => "ol"
          case _: OptGroup     => "optgroup"
          case _: Paragraph    => "p"
          case _: Param        => "param"
          case _: Pre          => "pre"
          case _: Progress     => "progress"
          case _: Quote        => "blockquote"
          case _: Script       => "script"
          case _: Select       => "select"
          case _: Source       => "source"
          case _: Span         => "span"
          case _: Style        => "style"
          case _: Table        => "table"
          case _: TableCaption => "caption"
          case _: TableCell    => "td"
          case _: TableCol     => "col"
          case _: TableRow     => "tr"
          case _: TableSection => "th"
          case _: TextArea     => "textarea"
          case _: Title        => "title"
          case _: Track        => "track"
          case _: Video        => "video"
      }
    }

}
