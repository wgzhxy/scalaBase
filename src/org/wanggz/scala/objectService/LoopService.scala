package org.wanggz.scala.objectService

import scala.io.Source

object LoopService {

  def callWhile(n: Int) = {
    var total: BigInt = 1;
    var i: Int = 0;
    while (i < n) {
      i += 1;
      total *= i;
    }
    total;
  }

  def callForTo() = {
    var total: BigInt = 0;
    for (i <- 1.to(100)) {
      total += i;
    }
    total;
  }

  def callForUntil(charstr: String) = {
    var length: Int = charstr.length() - 1;
    var returnStr: String = "";
    for (i <- 0.until(length)) {
      returnStr += charstr.charAt(i) + ",";
    }
    returnStr;
  }

  // for 高级推导
  def callHighForOne(str: String) :Unit = {
    for (i <- 0.to(10); j <- 10.to(20) if i * j != 0) {
      Console.println("i*j=" + i * j);
    }
  }

  // for 高级推导
  def callHighForTwo(str: String) = {
    for (i <- 0.to(10); j = i + 1; j <- 10.to(20) if i * j != 0) yield (i * j) % 3;
  }

  // for 高级推导
  def callHighForThree(str: String) : Unit = {
    for (i <- 0.to(10); j <- 10.to(20)) {
      Console.println("i*j=" + i * j);
    }
  }
  
  //读取文件流
  def readFileStream(filePath : String) : String = {
    Source.fromFile(filePath).mkString;
    throw new Exception("读取文件报错了~~~~~~~~~~~~");
  }
}