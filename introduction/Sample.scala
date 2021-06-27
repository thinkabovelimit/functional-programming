package introduction
/*
* Demo for mutable states*/


import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

object Sample {
  def main(args: Array[String]): Unit = {
    var x=0
    val fut1=Future{
      x=x+1
    }
    val fut2=Future{
      x=x*2
      println(x)
    }
    println(x)
  }

}
