package playground

object Playground extends App {
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 15);
    def getName(): String = name
    def getSample(): Option[String] = {
      if (this.age > 10) Some("Ok")
      else None
    }
  }

  var p = new Person("Mohammad")
  var p2 = new Person("Mohammad", 8)
  var p3 = new Person("Mohammad", 12)

  println(p.getSample())
  println(p2.getSample())
  println(p3.getSample())

  if (p3.getSample() == Some("OK")) {
    println("Ok")
  }

}
