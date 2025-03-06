package axion.sakundoproject1.javacore.Bintroductionmethods.domain;

public class Employee {
    private String name;
    private int age;
    private double[] salary;
    private double averageValue;

    public void print(){
        System.out.println("-------------------");
        System.out.println(this.name);
        System.out.println(this.age);
        if(salary == null) return;

        for(double n : salary){
            System.out.printf("%.2f ", n);
        }
        averageSalaryValue();

    }

    public void averageSalaryValue(){
        if (salary == null) return;

        System.out.println("\n------------");
        for(double n : salary){
            averageValue += n;
        }
        averageValue /= salary.length;
        System.out.printf("%.2f",averageValue);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getSalary() {
        return salary;
    }

    public void setSalary(double[] salary) {
        this.salary = salary;
    }

    public double getAverageValue() {
        return averageValue;
    }

}
