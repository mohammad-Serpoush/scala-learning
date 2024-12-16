package part02

object Generics extends App {
  class MyList[A] {}

  class MyMap[Key, Value]

  val listOfThings = new MyList[Int]
  val listOfThings2 = new MyList[String]

  object MyList {
    def empty[A]: MyList[A] = ???
  }

  val emptyListOfIntegers = MyList.empty[Int]

  // variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // If cat extends animal, does list of cats extend list of animals?
  // 3 possible answer

  // 1- Yes. List[Car] extends List[Animal] =  Covariance
  class CovariantList[+A]

  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]

  // 2- No = Invariance

  class InvariantList[A]

  var invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

  // 3- Hell No! = Contravariant

  class ContravariantList[-A]

  val contravariantList: ContravariantList[Cat] = new ContravariantList[Animal]

  //------------------------

  class Cage[A <: Animal](animal : A) // means only subtypes of Animal can be for A 
  val cage = new Cage(new Dog())
  
  //--------------------------

  

}
