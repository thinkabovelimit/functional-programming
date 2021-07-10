object AnonymousFunctions {
  val arr1 = List(1, 2, 3, 4, 5)
  val arr2 = List("apple", "orange", "grapes")

  def main(args: Array[String]): Unit = {
    println(findFirst(arr2, (x: String) => x == "grapes"))

  }
  /*
  * Inputs
  * -> An array of type T
  * -> A function,Which returns boolean
  *
  * traverse recursively through the loop
  * If element is present at the position returns 1
  * else increment the position
  * if elemnt is not present return zero*/
  def findFirst[T](as: List[T], f: T => Boolean): Int = {
    @annotation.tailrec
    def loop(n: Int): Int =
      if (n >= as.length) -1
      else if (f(as(n))) n
      else loop(n + 1)

    loop(0)
  }
}
