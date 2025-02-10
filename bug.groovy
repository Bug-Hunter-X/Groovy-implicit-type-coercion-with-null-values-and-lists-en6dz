```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return null //Correct: handles null inputs
  }
  return a + b
}

println myMethod(1, 2) //3
println myMethod(null, 2) //null
println myMethod(1, null) //null
println myMethod(null, null) //null

// Unexpected behavior
println myMethod([1,2], [3,4]) //[1, 2, 3, 4] - Correct, list concatenation
println myMethod([1,2], 3) //[1, 2, 3] - Correct, list and number concatenation
println myMethod(1, [3,4]) //[1, 3, 4] - Correct, number and list concatenation

//Surprise!
println myMethod(null, [3,4]) //[3, 4] - Wrong!
println myMethod([1,2], null) //[1, 2] - Wrong!
```