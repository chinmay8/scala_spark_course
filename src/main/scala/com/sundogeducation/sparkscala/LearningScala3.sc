// Functions

// format def <function_name>(paramter name: type ...): return type = { }

def squareIt(x: Int): Int = x * x

def cubeIt(x: Int): Int = x * x * x

println(squareIt(3))
println(cubeIt(5))

def transformInt(x: Int, f: Int => Int): Int =
  f(x)

println(transformInt(2,cubeIt))

transformInt(2, x => x * x * x) // Anonymous function example
