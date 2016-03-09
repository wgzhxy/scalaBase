package org.wanggz.scala.objectService

object BaseScalaType {

  def arrayUnit(str: String) {
    if (str == null || str.isEmpty()) {
      return ;
    }

    var i: Int = 0;
    var array: Array[Char] = new Array[Char](str.toCharArray().length);
    for (charS <- str.toCharArray()) {
      array.update(i, charS);
      i += 1;
    }

    //print all
    for (charS <- array) {
      Console.println("======================" + charS);
    }
  }

}