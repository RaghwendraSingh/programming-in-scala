1 + 2

println("Hello World!")

// Defining some variables
val msg = "Hello World!"

// Specifying variables type before variable name
val msg2: java.lang.String = "Hello World2"

// uncomment below line to see that reassignment to val results in error
//msg = "HW"

// creating a mutable var
var greeting = "Hello, World!"

// reassignment is allowed for mutable variables created using var
greeting = "HW"

// defining some functions

// function to return max of two numbers

def max(x: Int, y: Int): Int = {
  if (x > y) x
  else y
}

// calling the max function
max(-2, 3)

val words = "Hello World this is Scala".split(" ")

var i = 0
while (i < words.length) {
  println(words(i))
  i += 1
}

// iterate with foreach
words.foreach(println)

// for expression

for(word <- words) {
  println(word)
}