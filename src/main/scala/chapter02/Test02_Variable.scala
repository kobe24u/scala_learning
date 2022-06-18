package chapter02

import chapter01.Student

object Test02_Variable {
  def main(args: Array[String]): Unit = {
    // Declare a variable
    var a: Int = 10

    // When declaring a variable, type can be ommited
    var b = 12

    /*
     When a type is determined, we can't change anymore, which means
     Scala is a strong type language
     */
    var c = 15 // c type is Int
//    c = ""

    // When declaring a variable, we have to give it a default value
//    var d: Int

    /*
     When declaring a variable, we can use var or val
     With var, it's mutable
     With val, it's immutable
     */
    val e = 12
//    e = 13

    val alice = new Student("alice", 20)
//    alice = new Student("Alice", 20)
//    alice = null
    val bob = new Student("bob", 23)
    bob.age = 24
    bob.printInfo()
  }
}
