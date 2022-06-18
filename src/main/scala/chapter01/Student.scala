package chapter01

/*
  - no Static keyword anymore in Scala
  - class name and object name must match with each other
  - class and object must be defined in the same file
 */
class Student(name: String, var age: Int) {
  def printInfo(): Unit = {
    println(name + ", " + age + ", " + Student.school)
  }
}

// An object is a class that has exactly one instance
object Student {
  val school: String = "Oxford"

  def main(args: Array[String]): Unit = {
    val alice = new Student("alice", 20)
    val bob = new Student("bob", 35)

    alice.printInfo()
    bob.printInfo()
  }
}