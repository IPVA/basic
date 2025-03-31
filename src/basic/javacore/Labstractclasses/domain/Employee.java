package basic.javacore.Labstractclasses.domain;

public abstract class Employee extends Person{
    protected String name;
    protected double salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        calculateBonusSalary();
    }

    protected abstract void calculateBonusSalary();

    @Override
    public void print() {
        System.out.println("Printing.....");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
