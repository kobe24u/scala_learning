package chapter01

/*
  object: keyword, declare a single instance
 */

object HelloWorld {

  /*
    main function: can be called from outside world
    format:
      def functionName(paraName: paraType): returnValueType = {
        functionBody
      }

      > [] is used to hold generics Array[String] = Array<String> in Java
      > Unit = Void in Java
   */
  def main(args: Array[String]): Unit = {
    println("hello world")
    // We can directly use methods available in JAVA like so
    System.out.println("hello scala from java")
  }
}
