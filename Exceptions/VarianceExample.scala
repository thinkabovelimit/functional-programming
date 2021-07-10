package Exceptions

object VarianceExample {
  def main(args: Array[String]): Unit = {

  }
//  def mean(lis1:Seq[Double]):Option[Double]={
//    if (lis1.isEmpty) None
//    else Some(lis1.sum/lis1.sum)
//  }
  def mean(xs: Seq[Double]): Option[Double] = {
    if (xs.isEmpty) None
    else Some(xs.sum / xs.length)
    }

//  def variance(xs: Seq[Double]): Option[Double] = {
//    mean(xs).flatMap(m => mean(xs.map(x => Math.pow(x-m, 2))))
//  }
}
