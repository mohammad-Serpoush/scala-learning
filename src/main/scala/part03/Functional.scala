package part03

import part02.Empty.add

object Functional extends App {

  def concatinator: (String, String) => String =
    new Function2[String, String, String] {
      override def apply(v1: String, v2: String): String = return v1 + v2
    }

  def sampleFunction: (String, Int) => String = {
    new Function2[String, Int, String] {
      override def apply(v1: String, v2: Int): String = v1 * v2
    }
  }

  def addUp: (Int , Int) => Int = {
    new Function2[Int , Int ,  Int] {
        override def apply(v1: Int, v2: Int): Int = v1  * v2
    }
  }
  println(sampleFunction("mo", 2))
  println(addUp(3, 2))

}
