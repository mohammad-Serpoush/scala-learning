package part03;

import scala.collection.mutable.HashMap

object Tuples extends App {
  var aTuple = new Tuple2(1, "Scala")
  var aTuple2 = (1, 2, "hello")
  var names = ("Ali", "Mohammad", "John", "Fatemeh", "Matt")

  println(names._1)
  println(names.copy(_2 = "Sara"))
  println(names)

  val aMap: Map[String, Int] = Map()
  val phonebook1 = Map(("Jim", 555), ("Daniel", 666)).withDefaultValue(-1)
  println(phonebook1.contains("Jim"))
  println(phonebook1.get("Jim"))
  println(phonebook1 + ("Ahmad" -> 777))

  val phonebook2 = "John" -> 678
  println(phonebook1 + phonebook2)

  val phonebook = phonebook1 + phonebook2
  phonebook.map(pair => println(pair._1 + " : " + pair._2))
  var result = phonebook.map(pair => pair._1 -> pair._2)
  println(result)

  var result2 = phonebook.filter(pair => pair._2 > 600)
  println(result2)

  var result3 = phonebook.view.filterKeys(p => p.startsWith("J")).toMap
  println(result3)

  var result4 = phonebook.view.mapValues(v => v * 10).toMap
  println(result4)

  println(phonebook.toList)
  println(List(("Daniel", 555)).toMap)

  // --------------------------------

  val names2 = List("Bob", "James", "Angela", "Mary", "Daniel", "Jim")
  println(names2.groupBy(name => name.charAt(0)))

  // -------------------------------
  var information = HashMap(("Ali", 2), ("Mohammad", 3))

  println(information)

}
