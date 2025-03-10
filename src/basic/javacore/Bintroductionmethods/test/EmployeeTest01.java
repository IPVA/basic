package basic.javacore.Bintroductionmethods.test;
import basic.javacore.Bintroductionmethods.domain.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setName("Dub");
        employee.setAge(43);
        employee.setSalary(new double[]{1406.45,1785.35,906.27});

        employee.print();





    }
}
