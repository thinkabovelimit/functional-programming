object Factorial {
  def main(args: Array[String]): Unit = {
      println(factorial(10000))
  }
  def fact(n:BigInt):BigInt={
      if (n>1) n * fact(n-1)
      else 1
  }
  def factorial(n: BigInt): BigInt = {
    def go(n: BigInt, acc: BigInt): BigInt =
      if (n <= 0) acc
      else go(n-1, n*acc)
    go(n, 1)
  }
}
