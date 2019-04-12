import java.util.*

fun main(){
    val s= Scanner(System.`in`)

    val list= arrayListOf<Employee>()

    print("Enter the no. of Employees: ")
    val emps= s.nextInt()
    for (i in 1..emps) {
        val e= Employee()
        print("Enter employee name: ")
        e.name= s.nextLine()
        print("Enter employee age: ")
        e.age= s.nextInt()
        s.nextLine()
        list.add(e)
    }

    for (employee in list.filter { it.age > 30 }) {
        println("Employee name: ${employee.name}, Employee age: ${employee.age}")
    }

    s.close()
}

class Employee {
    var age: Int = 0
    var name: String = ""
}