package part03;

object HOF extends App {
  // HOF is function that accept function as input

  def nTimes(f: Int => Int, n: Int, x: Int): Int =
    if (n <= 0) x
    else nTimes(f, n - 1, f(x))

  val myFunction = (x: Int) => x * 3
  println(nTimes(myFunction, 2, 3))

  def nTimesBetter(f: Int => Int, n: Int): (Int => Int) =
    if (n <= 0) (x: Int) => x
    else (x: Int) => nTimesBetter(f, n - 1)(f(x))

  val plus10 = nTimesBetter(myFunction, 10)
  println(plus10(1))

  // curried functions
  val superAdder: Int => Int => Int = (x: Int) => (y: Int) => x + y
  val add3 = superAdder(3)
  println(add3(10))
  println(superAdder(10)(3))

  // functions with multiple parameter lists

  def curriedFormatter(c: String)(x: Double): String = c.format(x)

  val standardFormat: (Double => String) = curriedFormatter("%4.2f")

  println(standardFormat(10.2222))
}
