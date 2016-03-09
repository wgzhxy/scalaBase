package org.wanggz.scala

import org.wanggz.scala.service.CommService;
import org.wanggz.scala.service.impl.CommServiceImpl;

object TestMain {

  def main(args: Array[String]) {
    //if 语然
    ifElement;
    Console.println();

    //调用java Service 
    callJavaMethod;

    //表达式
    Console.println(express);
    
    Thread.sleep(1000);
  }

  def express = {
    var str: String = "good good";
    str.intersect("good");

    var newStr: String = "tst is test itest";
    newStr = newStr.concat(" 我是一个中国人");
    newStr.concat(str);

  }

  def callJavaMethod = {
    val service = new CommServiceImpl();
    Console.println("a + b = " + service.add(20, 80));
  };

  def ifElement = {
    //常量
    val check: Boolean = true;
    if (check) {
      Console.println("check is true");
    }

    //变量
    var testStr: String = "看看吧, this is good!";
    Console.printf("test %s \n", testStr.toUpperCase());
    Console.printf("%s, \n", testStr.toLowerCase());

    //if 语句
    if (check) {
      Console.printf("this is test, my god~~~~~~~, check:" + check);
    } else {
      Console.println("check value is " + check);
    }
  }
}