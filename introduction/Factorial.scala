package introduction

/*
* Code to demonstarte recursive and tail recursive function to find factorial
* of a number */


object Factorial {
  def main(args: Array[String]): Unit = {
    println(factorial(10000))
  }
  /*
  * Factorial of a number using recursion*/
  def fact(n: BigInt): BigInt = {
    if (n > 1) n * fact(n - 1)
    else 1
  }

  /*
  * factorial of a number using tail recursive method*/
  def factorial(n: BigInt): BigInt = {
    @annotation.tailrec
    def go(n: BigInt, acc: BigInt): BigInt =
      if (n <= 0) acc
      else go(n - 1, n * acc)

    go(n, 1)
  }
}
