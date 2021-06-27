package introduction

/*
* Demonstrate referential transparency and substitution method*/

object ReferentialTransperency {
  def main(args: Array[String]): Unit = {


    val str1 = "Hello all"
    val r1 = str1.reverse
    // replace str1 by the string
    val r2 = "Hello all".reverse
    //Transformation doesn't affect the outcome
    println(r1)
    println(r2)
    val str2=new StringBuilder("Hello")
    val y1=str2.append(" all").toString()
    val y2=str2.append(" all").toString()
    println(y1)
    println(y2)
    //Hello all
    //Hello all
  }
  }
