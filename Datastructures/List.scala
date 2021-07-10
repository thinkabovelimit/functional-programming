package Datastructures
/*
* Singly linked list in scala*/

//List type parameterised with type A
sealed trait List[+A]
//A list constructor representing an empty list
case object Nil extends List[Nothing]
//A list type representing an non empty list
case class Cons[+A](head:A,tail:List[A]) extends List[A]
object List {
  def main(args: Array[String]): Unit = {
    val x:List[Int]=Cons(1,Cons(2,Nil))
    val lisDouble:List[Double]=Nil
    val LisString:List[String]=Cons("Apple",Cons("Orange",Nil))
    println(sum(x))
    //sum is 3
    println(prod(x))
    //product is 2

    val k=Array(1,2,3)
    Array(1,Nil) match {
      case _ => println(23)
    }
    //prints 23
    Cons(1,Cons(2,Nil)) match {
      case Cons(h,_)=>println(h)
    }
    //1
    Cons(1,Cons(2,Nil)) match {
      case Cons(_,h)=>println(h)
    }
    //Cons(2,Nil)
  }

  /*
  * Function to calculate sum elements in a list*/
  def sum(lis:List[Int]):Int=lis match {
    case Nil => 0
    case Cons(x,xs)=>x+sum(xs)
  }
  /*
  * Function to calculate product of elements in a list*/
  def prod(lis: List[Int]):Int=lis match {
    case Nil=>1
    case Cons(0,_)=>0
    case Cons(x,xs)=>x*prod(xs)
  }

}
