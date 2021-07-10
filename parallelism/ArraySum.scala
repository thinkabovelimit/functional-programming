package parallelism
import scala.collection.parallel.CollectionConverters._
import scala.collection.parallel.ParSeq
object ArraySum {
  def main(args: Array[String]): Unit = {
    println(sum(List(1,2,3,4)))
    println(sumDivideAndConquer(Vector(1,2,3)))
    println(sumParallel(ParSeq(1,2,3)))
  }
  def sum(lis:List[Int]):Int={
    lis.foldLeft(0)(_+_)

  }
  def sumDivideAndConquer(lis:IndexedSeq[Int]):Int={
        if (lis.length<=1) lis.headOption getOrElse 0
        else {
          val (r,l)=lis.splitAt(lis.length/2)
          sumDivideAndConquer(l)+sumDivideAndConquer(r)
         }
  }
  /*
  * parallel computation using par data types
  * use par keyword*/
  def sumParallel(lis:ParSeq[Int]):Int={
    if (lis.length<=1) lis.headOption getOrElse 0
    else {
      val (l,r)=lis.splitAt(lis.length/2)
      sumParallel(l)+sumParallel(r)
    }
  }
}
