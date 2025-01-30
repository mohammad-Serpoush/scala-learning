package part03

object Map extends App {

  var names: List[Int] = List(1, 2, 3, 4)

  println(names.head)
  println(names.tail(1))
  println(names.map(_ + 1))
  println(names.find(_ % 2 == 1))

  val doubleUp = (x: Int) => x * 2

  println(names.map(doubleUp))

  val flatMapFunction = (x: Int) => List(x)
  val flatMap2Function = (x: Int) => List(x*2)

  println(names.flatMap(flatMapFunction))
  println(names.flatMap(flatMap2Function))

}
