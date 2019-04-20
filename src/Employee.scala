// construct of a class
// class Employee
class Employee(name: String, email: String, salary: Double) {
  var age = 0;
  def getEmployeeInfo() = {
  }
  def getSalary(): Int = {
    100;
  }
}

object Test extends App {
  val emp = new Employee("Nilesh", "Test", 100.20);
  emp.age = 50;
  val emp1 = new Employee("Nilesh", "Test", 100.20);
  emp1.age = 30
  println(emp1.age);
  println(emp.age);
}
