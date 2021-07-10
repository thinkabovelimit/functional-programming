import scala.collection.mutable.ListBuffer
object ListOperations {
  def main(args: Array[String]): Unit = {
    val v1=new ListClass
    println(v1.fruit)
    println(v1.nums)
    println(v1.nums)
    val lis1:List[String]=List("orange")
    val list_insert=v1.insert("apple",lis1)
    println(list_insert)

    val sample_buffer= new ListBuffer[Int]
    sample_buffer+=1
    println(sample_buffer)
  }


}
class ListClass{
  val lis1:List[Int]=List(1,2,3,4,5)
  val lis2:List[String]=List("Apple","orange","peaches")
  val fruit = "apples" :: ("oranges" :: ("pears" :: Nil))
  val nums=1 :: (2 :: Nil)
  /*
  * sample1 and sample2 are two lists of type A
  * Used to dempnstarte a list concatenation operation*/
  def concat(sample1:List[Int],sample2:List[Int]): List[Int] ={
    sample1 match{
      case List() => sample2
      case x :: xs1 => sample1 ::: sample2
    }
  }
  def isort(xs: List[Int]): List[Int] = xs match {
    case List() => List()
    case x :: xs1 => insert(x, isort(xs1))
  }
  /*
  Prameters-> X - element to be inserted into the list
             xs - List of type A

  * Insert an element into the list
  * if the list is empty insert at the end
  * else traverse to the end of the list recursively*/
  def insert[A](x: A, xs: List[A]): List[A] =
    if (xs.isEmpty || x == xs.head) x :: xs
    else xs.head :: insert(x, xs.tail)
}