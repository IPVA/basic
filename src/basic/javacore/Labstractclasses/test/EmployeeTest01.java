package basic.javacore.Labstractclasses.test;

import basic.javacore.Labstractclasses.domain.Developer;
import basic.javacore.Labstractclasses.domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Manager manager = new Manager("Agaroth", 6000);
        Developer developer = new Developer("Sakundo", 6000);


        System.out.println(manager);
        System.out.println(developer);
        manager.print();
        developer.print();

    }
}
