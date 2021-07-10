package Exceptions

object MeanException {
  def main(args: Array[String]): Unit = {

  }
  def mean(list1:List[Int]):Double={
    if(list1.isEmpty) throw new ArithmeticException("Mean of empty array is not possible")
    else list1.sum/list1.length
  }
}
