package part01

object Expressions extends App{
    def factorial(n: Int)  : BigInt  = {
        def factHelper(x:Int , accumulator: BigInt): BigInt = {
            if (x <= 1 ) accumulator
            else factHelper(x-1 , x * accumulator);
        }
        factHelper(n , 1)
    } 

    println(factorial(1000))


}
