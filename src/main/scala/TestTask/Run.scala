package TestTask

import TimeFormatter._
import ReadData._
import ReportWriter._

object Run {

  def main(args: Array[String]): Unit = {

    val time = convertStringToTimeComponentList("10:20")

    val lines = readFile("C:/Users/Admin/IdeaProjects/Test/src/main/scala/TestTask/config.txt")

    for (i <- 0 until lines.length){
      println(beautifyOutput(processLine(readLine(lines(i)),time)) + "\n")
    }





  }

}
