package TestTask

object TimeFormatter {


  def convertStringToTimeComponentList(time: String): List[String] = {
    time.split(":").toList
  }

  def timeToString (hour: Int, minute: Int): String ={
    hour + ":" + minute
  }

  def isTimePassed(list: List[String], time: List[String]): String={

    val yes = "Tomorrow"
    val no = "Today"

    if (list(0) == "*" && list(1) == "*"){
      no
    }else if ( list(1) != "*" && list(1).toInt < time(0).toInt){
      yes
    }else if (list(0) != "*" && list(0).toInt > time(1).toInt && list(0).toInt < time(1).toInt){
      yes
    }else{
      no
    }

  }
}