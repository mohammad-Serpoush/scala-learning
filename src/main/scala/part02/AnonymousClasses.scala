package part02

object AnonymousClasses extends App {
  abstract class Animal {
    def eat: Unit
  }

  // Anonymous class 
  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("Hahaha")
  }
  // We actually instantiate abstract class, but no... :)) see the print result!
  println(funnyAnimal.getClass())


  // What actually happened is like this:

  class AnonymousClasses$$anon$1 extends Animal {
    override def eat: Unit = println("Hahaha")
  }
  var funnyAnimal2 = new AnonymousClasses$$anon$1

  //-------------------------------
  // It actually work for non abstract class
  class Person(name: String){
    def sayHi: Unit = println(s"Hi my name is $name")
  }
  val jim = new Person("Mohammad") {
    override def sayHi: Unit = println("Hi Mohammad")
  }


}
