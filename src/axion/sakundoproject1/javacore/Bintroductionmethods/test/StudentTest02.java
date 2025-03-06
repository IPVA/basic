package axion.sakundoproject1.javacore.Bintroductionmethods.test;
import axion.sakundoproject1.javacore.Bintroductionmethods.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();

        student01.name = "Agaroth";
        student01.age = 22;
        student01.gender = 'M';

        student02.name = "Hitsuri Mei";
        student02.age = 19;
        student02.gender = 'F';

        student01.print();
        student02.print();

    }
}
