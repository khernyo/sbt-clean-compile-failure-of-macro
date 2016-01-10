package a.b

import argonaut.Shapeless._
import argonaut._

object Main extends App {
  println(implicitly[EncodeJson[T]].encode(C(1)))
}
