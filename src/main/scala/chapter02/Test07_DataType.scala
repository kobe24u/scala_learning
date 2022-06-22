package chapter02

import chapter01.Student

object Test07_DataType {
  def main(args: Array[String]): Unit = {
    // 1, Int
    val a1: Byte = 127
    val a2: Byte = -128
    // val a2: Byte = 128 // error

    val a3 = 12 // Int by default
    val a4 = 1212121212121212L // Long, prepare using Capital instead lowercases `l`

    val b1: Byte = 10
    val b2: Byte = 10 + 20// ignore the warning thrown by Idea

    val b3: Int = b1 + 20
    val b4: Byte = (b1 + 20).toByte

    // 2. Float
    val f1: Float = 1.2345f
    val d1 = 34.2245

    // 3, Char
    val c1: Char = 'a'
    val c2: Char = '9'

    // Special characters
    val c3: Char = '\t' // tabs
    val c4: Char = '\n' // line break

    println("abc" + c3+ "def")
    println("abc" + c4+ "def")

    // Escape character
    val c5 = '\\'
    val c6 = '\"'
    println("abc" + c5+ "def")
    println("abc" + c6+ "def")

    // Char can be saved as ASCII
    val i1: Int = c1
    println("i1 "+ i1)

    // 4, Boolean
    val isTrue: Boolean = true

    // 5, Empty
    // 5.1 Unit
    def m1(): Unit = {
      println("Hello World")
    }

    val a = m1()
    println(a)

    // 5.2 Null
    //val n: Int = null // error valueType can use null
    var student = new Student("alice", 20)
    student = null // Only can be used when it's a reference type
    println(student)

    // 5.3 Nothing
    def m2(n: Int): Int = {
      if (n == 0)
        throw new NullPointerException
      else
        return n
    }

    val b = m2(2)
    println(b)
  }

}
