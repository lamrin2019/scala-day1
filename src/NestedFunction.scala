
object NestedFunction {

  def outer(): Unit = {
    println("Outer")
    inner();
    def inner(): Unit = {
      println("Inner")
    }
  }

  def main(args: Array[String]): Unit = {
    outer();
  }
}
