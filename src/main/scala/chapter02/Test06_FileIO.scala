package chapter02

import java.io.{File, PrintWriter, Writer}
import scala.io.Source

object Test06_FileIO {
  def main(args: Array[String]): Unit = {
    // Read data from file
    Source.fromFile("src/main/resources/test06_testfile.txt").foreach(print)

    // Write data to a file
    val writer = new PrintWriter(new File("src/main/resources/test06_output.txt"))
    writer.write("Hello Scala from Java writer")
    writer.close()
  }
}
