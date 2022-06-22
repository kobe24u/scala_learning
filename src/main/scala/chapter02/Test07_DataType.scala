package chapter02

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
    val b3: Byte = (b1 + 20).toByte

    // 2. Float
    val f1: Float = 1.2345f
    val d1 = 34.2245
  }

}
