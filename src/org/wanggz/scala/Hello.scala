package org.wanggz.scala

object Hello {
  
  def printInfo(str : String, time : Int) : String =  {
     var buffer = new StringBuffer();
      buffer.append(str).toString();
  }
  
  def add(a : Int, b : Int) : Int = {a + b};
  
  def main(args: Array[String]) {
    println("Hello world!");
    println("����һ���й���");
    
    
    var address = "����һ���й���" + "����һ�£�����";
    println(address);
    Console.println(printInfo("this is just test", 5));
    
    Console.println(add(5, 6));
  }
}