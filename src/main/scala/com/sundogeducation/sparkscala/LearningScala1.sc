// Values are immutable constants
val hello: String = "Hello!"

// variables are mutable
var helloThere: String = hello
helloThere = hello + "There!"
println(helloThere)

// Data Types
val number: Int = 1
val truth: Boolean = true
val letterA: Char = 'a'
val pi: Double = 3.1415962
val piSinglePrecision: Float = 3.1415962f
val bigNumber: Long = 123456789
val smallNumber: Byte = 127

println("Here is a mess: " + number + truth + letterA)

println(f"Pi is about $piSinglePrecision%.3f")
println(f"Zero padding to left: $number%05d")
println(s"We can use s prefix to use variables like $number $truth $letterA")
println(s"S prefix isn't limited to variables. I can use expressions too. Like ${1+2}")

val ultimateAnswer = "The life, the universe and everything is 42."
val pattern = """.* ([\d]+).*""".r
val pattern(answer) = ultimateAnswer
println(answer.toInt)

// booleans
val isGreater = 1 > 2
val isSmaller = 1 < 2
val impossible = isGreater & isSmaller // for logical its not a way use &&
val anotherWay = isGreater && isSmaller
val otherAnotherWay = isGreater || isSmaller

def printPi(pi: Double): Unit = {
  val doubledPi = pi * 2
  println(f"Result is $doubledPi%.03f")
}
printPi(pi)
