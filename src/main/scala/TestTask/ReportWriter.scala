package TestTask

import TestTask.TimeFormatter._
import scala.collection.mutable.ListBuffer

object ReportWriter {

  def processLine(fileLineList: List[String], time: List[String]): List[String] = {

    var processedLine = ListBuffer.empty[String]

    if (fileLineList(1) == "*") {
      processedLine += time(0)
    } else {
      processedLine += fileLineList(1)
    }
    if (fileLineList(0) == "*") {
      processedLine += time(1)
    } else {
      processedLine += fileLineList(0)
    }
    processedLine += todayTomorrow(isTimePassed(fileLineList, time))
    processedLine += fileLineList(2)
    processedLine.toList
  }

  def beautifyOutput(line: List[String]): String = {
    line(0) + ":" + line(1) + " " + line(2) + " " + line(3)
  }
}
