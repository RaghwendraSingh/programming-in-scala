// instantiate a new java.math.BigInteger and parameterize it with 12345
val big = new java.math.BigInteger("12345")

// when parameterizing an instance with both type and value . the type comes in square brackets and value in parenthesis
val greetStrings = new Array[String](3)

greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "World!\n"

greetStrings.foreach(print)

// calling below code gets converted to apply method which returns the element at ith location
greetStrings(0)

// initializing array without new keyword
val numNames = Array("zero", "one", "two")

// creating mutable list
val mutableList = new java.util.ArrayList[String]()
mutableList.add("Home")
mutableList.add(" Sweet")

mutableList.forEach(println)

// creating a immutable list
val oneTwoThree = List(1,2,3)

// concatenating lists
val oneTwo = List(1, 2)
val threeFour = List(3, 4)

val oneTwoThreeFour = oneTwo ::: threeFour
println(oneTwoThreeFour)

// using '::' cons operator to prepend an element at the start of a list
// when a function name ends with : the the function is called on the right element
val twoThree = List(2, 3)
val oneTwoThree2 = 1 :: twoThree
println(oneTwoThree2)
oneTwo match {
  case head :: tail =>
    println(head)
    println(tail)
  case _ => println("???")
}


// creating a new list from individual list elements, this needs a Nil element at the end
val indvEleList = 1 :: 2 :: 3 :: 4 :: Nil

// append in List vs cons operator
// the append operator :+ is rarely used because the time it takes to append
// a list grows linearly with the size of the list
// whereas the :: operator takes constant time
// if you want to build a list efficiently by appending elements
// then you can prepend them and when you are done call reverse



// Tuple
// tuple is another container object. Like List tuple is also immutable
// but unlike List tuple can contain different types of objects

val pair = (99, "Seasons")
println(pair._1)
println(pair._2)


import scala.collection.mutable

val movieSet = mutable.Set("Hitch", "Poltergeist")
movieSet += "Shrek"
println(movieSet)

//assert(1 != 1, "Yes")

// read lines from a file
import scala.io.Source

val index = Source.fromFile("/home/hyperledger/index.html").getLines().toList
println(index.length)

index.reduceLeft(
  (a: String, b: String) => if(a.length < b.length) a else b
)

index.reduce(
  (a: String, b: String) => if(a.length < b.length) a else b
)

val mp = scala.collection.mutable.Map[Int, String]()

mp += (1 -> "I")
mp.put(2, "II")
mp += (3 -> "III")