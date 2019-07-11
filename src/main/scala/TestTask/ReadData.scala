package TestTask


object ReadData {

  def readFile(filePath: String): List[String] = {
    val source = scala.io.Source.fromFile(filePath)
    try source.getLines().toList finally source.close()
  }

  def readLine(fileLine: String): List[String] = {
    fileLine.split(" ").toList
  }
}


