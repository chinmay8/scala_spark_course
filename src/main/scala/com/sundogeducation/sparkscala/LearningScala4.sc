// Data Structures

// Tuples
// Lists

val captainStuff = ("Picard", "Enterprise-D", "NCC")
println(captainStuff)

// Refer to the individual fields with one-based index

println(captainStuff._1)
println(captainStuff._2)
println(captainStuff._3)

val picardShip = "Picard" -> "Enterprise-D"
println(picardShip._2)

val aBunchOfStuff = ("String", 1964, true)

// Lists

// Like a Tuple but more functionality
// Must be of same type

val shipList = List("Enterprise", "Defiant", "Voyager")

println(shipList(1)) // Zero based

println(shipList.head)
println(shipList.tail)

for (ship <- shipList) {println(ship)}

val backwardShips = shipList.map((ship: String) => {
  ship.reverse
})

for (ship <- backwardShips) {println(ship)}

// reduce() to combine all the items together in a collection using a function
val numberList = List(1,2,3,4,5)

val sum = numberList.reduce((x: Int,y: Int) => x + y)
println(sum)

// filter() removes stuff
val iHateFives = numberList.filter((x: Int) => x != 5)

val iHateThrees = numberList.filter(_ != 3)

// Concatenate List

val moreNumbers = List(6,7,8)
val lotsOfNumbers = numberList ++ moreNumbers

val reversed = numberList.reverse
val sorted = reversed.sorted
val lotsOfDuplicates = numberList ++ numberList
val distinctNumbers = lotsOfDuplicates.distinct
val maxNumber = numberList.max
val sum = numberList.sum
val hasThree = numberList.contains(3)

// Maps

val shipMap = Map("Kirk" -> "Enterprise", "Picard" -> "Enterprise-D", "Sisko" -> "Deep Space Nine", "Janeway" -> "Voyager")
println(shipMap("Janeway"))
println(shipMap.contains("Archer"))
val archerShip = util.Try(shipMap("Archer")) getOrElse "Unknown"
println(archerShip)

val numbers = (1 to 20).toList
for (number <- numbers) {
  if (number % 3 == 0) {
    print(number)
  }
}

numbers.filter(_ % 3 == 0)





