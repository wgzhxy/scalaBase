package org.wanggz.scala.objectService

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
  
  def callForUntil(charstr : String) = {
    var length : Int = charstr.length() - 1;
    var returnStr : String = "";
    for (i <- 0.until(length)) {
      returnStr += charstr.charAt(i) + ",";
    }
    returnStr;
  }

}