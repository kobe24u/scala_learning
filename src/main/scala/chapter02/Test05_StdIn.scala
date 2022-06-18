package chapter02

import scala.io.StdIn

object Test05_StdIn {
  def main(args: Array[String]): Unit = {
    // Input info
    println("Please type your name")
    val name: String = StdIn.readLine()
    println("Please type your age")
    val age: Int = StdIn.readInt()

    println(s"Welcome $age year old $name")
  }
}
