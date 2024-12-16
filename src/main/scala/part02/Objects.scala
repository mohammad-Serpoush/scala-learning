package part02

object Objects extends App {
    // Scala doesnt have class level functionality("static")
    // It has Object
    object  Person{
        val name: String = "Mohammad" 
        def introduce: String = "I am mohammad"
    }

    println(Person.introduce)

    val mary = Person
    val john = Person

    println(mary == john) // true
}


