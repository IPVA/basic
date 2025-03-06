package axion.sakundoproject1.introduction;

public class Class03PrimitiveTypesExercise {
    public static void main(String[] args) {

        var name = "Sakundo";
        var address = "Rua Fernando Augustinho 110";
        var salary = 1500.00;
        var date = "01/02/2025";
        String report = System.out.printf("I %s, living at %s, confirm that I received the salary of %.2f on %s " , name , address , salary , date).toString();

        System.out.printf(report);

    }
}
