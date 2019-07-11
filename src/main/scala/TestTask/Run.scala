package TestTask

import TimeFormatter._
import ReadData._
import ReportWriter._

object Run {

  def main(args: Array[String]): Unit = {

    val time = convertStringToTimeList(scala.io.StdIn.readLine() )

    val lines = readFile("config.txt")

    for (i <- 0 until lines.length) {
      println(beautifyOutput(processLine(readLine(lines(i)), time)) + "\n")
    }
  }
}
