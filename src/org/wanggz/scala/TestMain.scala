package org.wanggz.scala

import org.wanggz.scala.service.CommService;
import org.wanggz.scala.service.impl.CommServiceImpl;

object TestMain {

  def main(args: Array[String]) {
    //if ��Ȼ
    ifElement;
    Console.println();

    //����java Service 
    callJavaMethod;

    //���ʽ
    Console.println(express);
    
    Thread.sleep(1000);
  }

  def express = {
    var str: String = "good good";
    str.intersect("good");

    var newStr: String = "tst is test itest";
    newStr = newStr.concat(" ����һ���й���");
    newStr.concat(str);

  }

  def callJavaMethod = {
    val service = new CommServiceImpl();
    Console.println("a + b = " + service.add(20, 80));
  };

  def ifElement = {
    //����
    val check: Boolean = true;
    if (check) {
      Console.println("check is true");
    }

    //����
    var testStr: String = "������, this is good!";
    Console.printf("test %s \n", testStr.toUpperCase());
    Console.printf("%s, \n", testStr.toLowerCase());

    //if ���
    if (check) {
      Console.printf("this is test, my god~~~~~~~, check:" + check);
    } else {
      Console.println("check value is " + check);
    }
  }
}