package TestTask

object TimeFormatter {

  def convertStringToTimeList(time: String): List[String] = {
    if (time.length == 5) {
      time.split(":").toList
    }
    else {
      println("Invalid time format")
      List("00", "00")
    }
  }

  def isHourPassed(fileList: List[String], time: List[String]): Boolean = {
    fileList(1).toInt < time(0).toInt
  }

  def isMinutePassed(fileList: List[String], time: List[String]): Boolean = {
    fileList(0).toInt < time(1).toInt
  }

  def isTimePassed(fileList: List[String], time: List[String]): Boolean = {

    if (fileList(0) == "*" && fileList(1) == "*") {
      false
    } else if (fileList(1) != "*" && isHourPassed(fileList, time)) {
      true
    } else if (fileList(0) != "*" && isMinutePassed(fileList, time) && isHourPassed(fileList, time)) {
      true
    } else {
      false
    }
  }

  def todayTomorrow(boolean: Boolean): String = {
    if (boolean == true) {
      "Tomorrow"
    } else {
      "Today"
    }
  }

}