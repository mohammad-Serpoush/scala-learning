package part03

object Anonymous extends App {

  val doubler = (x: Int) => x * 2
  val doubler2: Int => Int = (x) => x * 2

  val adder: (Int, Int) => Int = (x, y) => x + y

  val justDoSth = () => 3

  // parentheses for lambda is mandatory
  println(justDoSth)
  println(justDoSth())

  // -------

  val stringToInt = { (str: String) =>
    str.toInt
  }

  // These 2 are equal
  val niceIncrementor: Int => Int = (x: Int) => x + 1
  val niceIncrementor2: Int => Int = _ + 1

  println(niceIncrementor2(2))

  // These 2 are equal
  val niceIncrementor3: (Int, Int) => Int = (x: Int, y: Int) => x + y
  val niceIncrementor4: (Int, Int) => Int = _ + _

  println(niceIncrementor4(2 , 2))
}
