//package Exceptions
///*
//* Scala code for handling errors
//* in functional programming*/
//object ExceptionHandling {
//
//
//  def main(args: Array[String]): Unit = {
//      println(FailingFun(12))
//  }
//
//  def FailingFn(i:Int):Int={
//    val y:Int = throw new Exception("fail")
//    try{
//      val x=3
//      x+y
//    }
//      //case e:Exception is a pattern matching statement that matches any kind of exception
//    catch {case e :Exception=>43}
//  }
//  /*
//  * problem with the failing function is that it is not
//  * referentially transparent*/
//  def FailingFun(i:Int):Int={
//    try{
//      val x=3
//// A thrown exception can be given any type here we are giving it a type Int
//      x+((throw new Exception("fail")):Int)
//    }
//    catch {case e:Exception=>43}
//  }
//
//
//
//}
