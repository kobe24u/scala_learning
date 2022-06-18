package chapter02

object Test03_Identifier {
  def main(args: Array[String]): Unit = {
    // Start with number or underscore
    val hello: String = ""
    val Hello123: String = ""
    val _Hello123: String = ""

//    val h-b = "" // Wrong but IDEA can't detect
//    val 123abc: String = "" // wrong

    // Start with operator and only include operator(s)
    val -+/% = "hello"
    println(-+/%)

    // Using `....` to include any string, can use reserved keywords as well
    val `if` = "if"
    println(`if`)
  }
}
