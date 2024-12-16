package part02

object OO extends App {
  val person = new Person("Mohammad")
  println(person.age)
  person.greet("Mohammad", "Fateme")
  println(person.birthYear)

  var s = new Student("123" , person);
  println(s.id)


  var counter = new Counter(5)
  counter.inc.inc.inc.print

}

// name cannot be use as member of class(it not member. its just parameter)
// you can not access with dot. you should add var keyword.)
class Person(firstName: String, lastName: String, var age: Int) {
  val x = 2
  // overloading constructors
  def this(firstName: String, lastName: String) = this(firstName, lastName, 15);
  def this(firstName: String) = this(firstName, "Serpoush", 18);
  def this() = this("Mohammad", "Serpoush", 20)
  // Method
  def greet(): Unit = println("Hello world!")
  def greet(name: String): Unit = println(s"${this.firstName} Says to $name")
  def greet(name1: String, name2: String): Unit = println(
    s"$name1 Says to $name2"
  )

  def birthYear  = 2024 - age

  def fullName = this.firstName + " " + this.lastName

}

class Student(number: String , person : Person){
  def id = number +" " + person.fullName
 }



class Counter(val count : Int){
  def inc= {
    new Counter(count + 1)
  }

  def dec= {
    new Counter(count - 1)
  }

  def print = println(count)
}