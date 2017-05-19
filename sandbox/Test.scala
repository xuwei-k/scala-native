object Test {
  def main(args: Array[String]): Unit = {
    classOf[List[_]].getMethods.foreach(println)
  }
}
