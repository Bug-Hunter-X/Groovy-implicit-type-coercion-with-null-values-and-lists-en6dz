```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return null
  }
  if (a instanceof List && b instanceof List) {
    return a + b // List concatenation
  } else if (a instanceof List) {
    return a + b  //List and number/other type concatenation
  } else if (b instanceof List) {
    return a + b //Number/other type and List concatenation
  } else if (a instanceof Number && b instanceof Number) { 
     return a + b //Number addition
  } else {
    return "Unsupported types" // Handle other scenarios appropriately
  }
}

println myMethod(1, 2) //3
println myMethod(null, 2) //null
println myMethod(1, null) //null
println myMethod(null, null) //null
println myMethod([1,2], [3,4]) //[1, 2, 3, 4]
println myMethod([1,2], 3) //[1, 2, 3]
println myMethod(1, [3,4]) //[1, 3, 4]
println myMethod(null, [3,4]) //null
println myMethod([1,2], null) //null
```