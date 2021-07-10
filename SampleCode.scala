import java.io.{File, PrintWriter}
object SampleCode {
  def main(args: Array[String]): Unit = {
    val s1=new SampleClass
    println(s1.findNeg(List(1,1)))
    println(s1.curriedSum(1)(1))
    println(s1.twise(_+1,8))
    s1.printWriter(new File("hello.txt"),writer=>writer.println("hello alll"))
  }
}
class SampleClass{
  def findNeg(list1:List[Int]): Boolean ={
    if (list1.exists(_ < 0))
      true
    else
      false

  }
  def curriedSum(x:Int)(y:Int)=x+y
  def twise(op:Double=>Double,x:Double)=op(op(x))
  def printWriter(file:File,op:PrintWriter=>Unit): Unit ={
    val writer=new PrintWriter(file)
    try{
      op(writer)
    }
    finally {
      writer.close()
    }
  }
}
