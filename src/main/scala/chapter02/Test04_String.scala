package chapter02

object Test04_String {
  def main(args: Array[String]): Unit = {
    // Combine using + plus sign
    val name: String = "alice"
    val age: Int = 8
    println(age + " year old " + name + " is coding")

    // * is used to duplicate string multiple times and combine together
    println(name * 3)

    // printf pass  value using %
    // f stands for formatting
    printf("%d year old %s is coding", age, name)
    println()

    // Insert variable to string using $ sign
    println(s"$age year old $name is coding")

    val num: Double = 2.3456
    println(s"The num is $num") // Output 2.3456
    println(f"The num is $num%2.2f") // Output 2.35
                                      // .2 means only reserve two digits
    println(raw"The num is $num%2.2f") // Output 2.3456%2.2f

    // Three quotes， for multiple line string
    val sql = s"""
      |select *
      |from
      |   student
      |where
      |   name = $name
      |and
      |   age > $age
      |""".stripMargin
    println(sql)
  }
}
