package org.wanggz.scala

object Hello {
  
  def printInfo(str : String, time : Int) : String =  {
     var buffer = new StringBuffer();
      buffer.append(str).toString();
  }
  
  def add(a : Int, b : Int) : Int = {a + b};
  
  def main(args: Array[String]) {
    println("Hello world!");
    println("我是一个中国人");
    
    
    var address = "我是一个中国人" + "测试一下，哈哈";
    println(address);
    Console.println(printInfo("this is just test", 5));
    
    Console.println(add(5, 6));
  }
}