package axion.sakundoproject1.javacore.Bintroductionmethods.test;
import axion.sakundoproject1.javacore.Bintroductionmethods.domain.Student;
import axion.sakundoproject1.javacore.Bintroductionmethods.domain.StudentPrinter;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();
        StudentPrinter printer = new StudentPrinter();


        student01.name = "Sakundo";
        student01.age = 23;
        student01.gender = 'M';

        student02.name = "Shaiko";
        student02.age = 22;
        student02.gender = 'F';

        printer.print(student01);
        System.out.println("--------------------------");
        printer.print(student02);



    }
}
