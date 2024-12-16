package part02


abstract class MyList{


    def head: Int
    def tail: MyList
    def isEmpty: Boolean
    def add(element: Int): MyList
    def printElements: String
    override def toString(): String = "[" + printElements + "]"
}
