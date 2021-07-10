
import scala.collection.mutable

object MyObj extends {
  private val cache = mutable.Map.empty[String, Int]

  def main(args: Array[String]): Unit = {
    println(calculate("b"))

  }
  def calculate(s: String): Int =
    if (cache.contains(s))
      cache(s)
    else {
      val acc = new CheckSumAccumulator
      for (c <- s)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }

}
class CheckSumAccumulator(){
  private var sum=0
  def add(b:Byte):Unit=sum +=b
  def checksum():Int= ~(sum & 0xFF) + 1
}
