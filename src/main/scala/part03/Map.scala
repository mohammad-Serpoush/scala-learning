package part03

object Map extends App {

  var nums: List[Int] = List(1, 2, 3, 4)

  println(nums.head)
  println(nums.tail(1))
  println(nums.map(_ + 1))
  println(nums.find(_ % 2 == 1))

  val doubleUp = (x: Int) => x * 2

  println(nums.map(doubleUp))

  val flatMapFunction = (x: Int) => List(x)
  val flatMap2Function = (x: Int) => List(x * 2)

  println(nums.flatMap(flatMapFunction))
  println(nums.flatMap(flatMap2Function))

  var chars = List("a", "b", "c", "d")
  var colors = List("Red", "Blue", "Green")

  var combinations1 = nums.flatMap(n => chars.map(c => c + n))
  var combinations2 = nums.flatMap(n =>
    chars.flatMap(c => colors.map(color => c + n + ": " + color))
  )

  println(combinations1)
  println(combinations2)

  def myPrint(x: String): Unit = println(x)

  colors.foreach(myPrint)

  var forComprehension = for {
    c <- chars
    n <- nums
    color <- colors
  } yield c + n + ": " + color

  println(forComprehension)

}
