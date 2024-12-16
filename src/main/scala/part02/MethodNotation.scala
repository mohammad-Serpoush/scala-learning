package part02

object MethodNotation {
  class Person(val name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean = movie == favoriteMovie
  }

  class Math(n: Int) {
    def +(m: Int) = {
      new Math(n + m)
    }
    def -(m: Int) = {
      new Math(n - m)
    }
    def print() = println(n)

    def unary_- : Int = -n

    def apply() = println("Ok! I'm here!")
  }


  // Instead of extends App
  def main(args: Array[String]): Unit = {

    val m = new Person("Mary", "Inception")
    println(m.likes("Inception"))
    //
    println(m likes "Inception")

    val calc = new Math(5)
    var res = calc + 10 - 20
    val y = 1.unary_-

    println(-new Math(5)) // because we implement unary_-

    res() // call apply because it doesnt have parameter!

  }

}
