package Structures

/*
* Monoid example whose algebra is defined by two operations
* 1-Associative
* 2-Existence of an identity element*/
trait Monoid[A]{
  def op(a:A,b:A):A
  def zero:A
}

/*
* Monoid to implement a
* foldleft method*/
object MonoidExample {
  def main(args: Array[String]): Unit = {

    val words=List("high","est"," ","index")
    val word=words.foldLeft(StringMonoid.zero)(StringMonoid.op)
    println(word)
    println(StringMonoid.op("hello","all"))

  }
  def listMonoid[A] = new Monoid[List[A]] {
    def op(a1: List[A], a2: List[A])  = a1 ++ a2
    val zero = Nil
  }
  val StringMonoid=new Monoid[String]{
    def op(str1:String,str2:String):String=str1+str2
    def zero:String=""
  }
  /*
  * generic function for concatenation
  * Using monoid*/

//  def Concatenate[A](lis:List[Int],m:Monoid[A]):A={
//    lis.foldLeft(m.zero)(m.op)
//  }
}
