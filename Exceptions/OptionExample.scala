package Exceptions

sealed trait Option[+A]
/*
* Two implementation of the option type
* it will return a None
* or it will return a Some*/
case class Some[+A](get:A) extends Option[A]
case object None extends Option[Nothing]
object OptionExample {

  def main(args: Array[String]): Unit = {
      println(meanExample(List()))
  }
  /*
  * It can take any of the two values
  * either a None value in case of an exception
  * or a Some in cases with no exception*/
  def mean(lis1:Seq[Double]):Option[Double]={
    if (lis1.isEmpty) None
    else Some(lis1.sum/lis1.length)
  }

  /*
  * Function to take the mean of a list
  * using pattern matching and option type*/
  def meanExample(lis:Seq[Double]):Option[Double]= {
    lis match {
      case Nil => None
      case _ => Some(lis.sum / lis.length)
    }
  }
    /*
    * Implementation of variance function in terms
    * of flatmap
    * */


}
