package part02

object Inheritance extends App {

  class Animal {
    def eat = println("YumYumYum")
    private def clean = println("ShipShip")
    protected def drink = println("gloop")
    val name: String = "Animal"
  }

  // Inherit all non private
  class Cat extends Animal {
    def crunch = {
      eat
      println("Crunch")
    }
  }

  val cat = new Cat()

  cat.eat
  // cat.clear
  cat.crunch

  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
    def getName(): String = return name
  }

  class Adult(name: String, age: Int, idCard: String)
      extends Person(name, age) {}

  class Dog extends Animal {
    override val name: String = "Doggy"
    override def eat: Unit = println("Crunch Crunch!!")
  }

  // type substitution
  val unknownAnimal: Animal = new Dog();

  unknownAnimal.eat

  // super

  class Student(name: String, id: Int) extends Person(name) {
    override def getName(): String = return id + "-" + name

    def getInfo(): String = {
      if (id == 0) {
        return getName()
      } else {
        return super.getName()
      }
    }
  }

  // preventing overrides
  // use final
  // we can use final both for class and function
  // new: seal the class: Only it can extend in this file
  class Alphabet {
    final def say(): Unit = println("ABCDEFG")
    def okToOverride(): Unit = println("OK")
  }

  class Child extends Alphabet {
    override def okToOverride(): Unit = println("Child")

  }

}
