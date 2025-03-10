package basic.javacore.Bintroductionmethods.test;
import basic.javacore.Bintroductionmethods.domain.Student;
import basic.javacore.Bintroductionmethods.domain.StudentPrinter;

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
