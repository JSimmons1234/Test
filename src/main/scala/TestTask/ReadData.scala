package TestTask



object ReadData {


def readFile (line:String): List[String] = {
  val source = scala.io.Source.fromFile(line)
  try source.getLines().toList finally source.close()

  }

  def readLine (line:String): List[String] = {
    line.split(" ").toList

  }




  }


