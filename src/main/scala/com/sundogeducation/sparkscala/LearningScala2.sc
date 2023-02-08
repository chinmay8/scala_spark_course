// Flow Control

// If / else

if (1 > 3) println("Impossible") else println("The world makes sense")

if (1 > 3) {
  println("Impossible")
  println("Really?")
} else {
  println("The world makes sense")
  println("stills")
}

// Matching using case statements
val number = 3
number match {
  case 1 => "One"
  case 2 => "Two"
  case 3 => "Three"
  case _ => "Something Else"
}

// For loops
for (x <- 1 to 4) {
  println(x * x)
}

var x = 10
while (x >= 0) {
  println(x)
  x -= 1
}

x = 0
do { println(x); x += 1} while (x <= 10)

// Expressions

{val x = 10; x + 20}

println({val x = 10; x + 20})

