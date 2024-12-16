package part01

object Strings extends App {


  var a : String = "Mohammad Serpoush"
  
  println(a.charAt(2))
  println(a.substring(7 , 11))
  println(a.split(" ").toList)
  println(a.startsWith("M"))
  println(a.replace(" " , "_"))
  println(a.toLowerCase())
  println(a.length)


  var b :String = "25";
  println(b.toInt)

  println("a--" + a + "--a" )

  println(a.reverse)
  var name = "Mohammad"
  var age = 27
  var weight = 89.5
  var formattedString = s"Hello, my name is $name and I am $age years old!"

  var formattedString2 = f"Hello, my name is $name%s my weight is $weight%2.2f"

  println(formattedString2)

}
