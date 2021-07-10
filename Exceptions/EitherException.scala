package Exceptions
/*
* Sealed trait E and its two implementation
* Exception for handling exceptions and
* Success for handling success*/
sealed trait Either[+E,+A]
/*
* Two implementation of Either
* class Exception takes an exception and success as nothing
* class Success takes exception as Nothing and a value*/
case class Exception[+E](value:E) extends Either[E,Nothing]
case class Success[+A](value:A) extends Either[Nothing,A]

object EitherException {
  def main(args: Array[String]): Unit = {
      println(mean(List()))
  }
  def mean(lis1:List[Int]):Either[String,Double]={
    if (lis1.isEmpty) Exception("Mean of an empty array")
    else Success(lis1.sum/lis1.length)
  }


}
