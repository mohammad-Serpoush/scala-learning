package part02

object Traits extends App {
  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }

  class Dog extends Animal {
    // override is not mandatory
    override val creatureType: String = "Canine"
    override def eat: Unit = println("Crunch")
  }
  // traits is like abstract classes, but unlike abstract classes they can be inherited along classes
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  class Crocodile extends Animal with Carnivore {
    override val creatureType: String = "Croc"
    override def eat(animal: Animal): Unit = println("Eating: " + animal.creatureType)
    override def eat: Unit = println("Nom")
  }


  var dog = new Dog()
  var croc = new Crocodile()

  croc.eat(dog)

  // traits vs abstract class 
  // 1- multiple traits inheritance is possible
  // traits are behavior, abstract class is type of things 
}
