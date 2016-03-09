package org.wanggz.scala

import org.wanggz.scala.objectService.LoopService

object LoopMain {

  def main(args: Array[String]) {

    //while ≤‚ ‘
    var total: Any = LoopService.callWhile(10);
    Console.println(total);

    //for ≤‚ ‘
    var total2: Any = LoopService.callForTo();
    Console.println(total2);

    //for until 
    var charstr: String = "hellow1234567";
    var toString: Any = LoopService.callForUntil(charstr);
    Console.println(toString);
  }

}