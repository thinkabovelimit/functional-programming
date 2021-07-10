import math.abs
object Facto {

  def main(args: Array[String]): Unit = {
//    println(factorial(10))
//    println(formatResult("factorial",7,factorial))
//    println(formatResult("absolute value",2,abs))
    println(findFirst(Array(1,2,3,4),(x:Int) => x==2 ))
  }
  def factorial(n:Int): Int={
    /*
    * go function is defined inside factorial function
    * hence local to factorial,can be referred from only inside factorial
    * this approach can be used as a substitute for using mutable variable inside a function*/
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n-1, n*acc)
    go(n, 1)

  }
  def abs(n:Int):Int={
    if (n<0) abs(n)
    else n
  }
  def findFirst[A](arr:Array[A],f:A=>Boolean):Int={
    /*
    * loop is a function defined inside findFirst
    * this prevents the use of a for loop and prevents mutation*/
    def loop(n:Int):Int={
      /*
      * checks for the position of element if not found returns -1
      * else returns the position*/

      if (n>=arr.length) -1
      else if (f(arr(n))) n
      else loop(n+1)

    }
    loop(0)
  }
  def formatResult(name:String,n:Int,f:Int=>Int)={
    val msg="The %s of %d is %d."
    msg.format(name,n,f(n))
  }

}
