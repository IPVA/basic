package basic.javacore.Labstractclasses.domain;

public class Manager extends Employee{
    public Manager(String name, int salary) {
        super(name, salary);
    }

    @Override
    protected void calculateBonusSalary() {
        this.salary = this.salary + this.salary * 0.1;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
