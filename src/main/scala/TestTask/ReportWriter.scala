package TestTask

import TestTask.TimeFormatter.isTimePassed
import scala.collection.mutable.ListBuffer

object ReportWriter {

  def processLine (list: List[String], time: List [String]): List[String] = {

    var processedLine = ListBuffer.empty[String]

    if (list(1) == "*"){
      processedLine += time(0)
    } else {processedLine += list(1)}
    if (list(0) == "*"){
      processedLine += time(1)
    } else{processedLine += list(0)}
    processedLine += isTimePassed(list,time)
    processedLine += list(2)
    processedLine.toList
  }

  def beautifyOutput (line: List[String]): String ={
    line(0)+":"+line(1)+" "+line(2)+" "+line(3)
  }

}
