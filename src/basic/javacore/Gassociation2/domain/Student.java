package basic.javacore.Gassociation2.domain;

public class Student {
    private String name;
    private int age;
    private Seminar seminar;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

}