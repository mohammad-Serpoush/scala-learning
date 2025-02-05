package part03;

object Sequences extends App {
  val aSeq = Seq(1, 2, 5, 6, 3);
  println(aSeq);
  println(aSeq.reverse);
  println(aSeq.apply(2));
  println(aSeq.contains(1));
  println(aSeq ++ Seq(5, 6, 7));
  println(aSeq ++ Seq(5, 6, 7));
  println(aSeq.sorted);

  val aRange: Seq[Int] = 1 to 4; // 1,2,3,4
  val bRange: Seq[Int] = 1 until 4; // 1,2,3

  aRange.foreach(println)
  bRange.foreach(println)

  (1 to 10).foreach(x => println("Hello" + x))
}
// lists are immutable linked list.
// head, tail, isEmpty are so fast O(1)
object Lists extends App {
  val aList = List(1, 2, 3);
  val prepend = 42 :: aList;
  val append = aList :+ 42;
  val prepend2 = 42 +: aList;

  println(aList)
  println(prepend)
  println(append)
  println(prepend2)

  // -------------
  val apples5: List[String] = List.fill(5)("apples")
  println(apples5)
  println(apples5.mkString("-|-"))

}

object Arrays extends App {
  val numbers = Array(1, 2, 3, 4)
  val numbers2 = Array.ofDim[Int](3)
  numbers.foreach(println)

  numbers(0) = 3
  numbers.update(1, 5)
  println(numbers.mkString(" "))

  val numsSeq: Seq[Int] = numbers // implicit conversion
  println(numsSeq)
}
// Good Performance in read and write
object Vectors extends App {
  val vector1: Vector[Int] = (1 to 10).toVector;
  var vector2: Vector[Int] = Vector(1, 2, 3);
  println(vector1)
  println(vector2)
}
