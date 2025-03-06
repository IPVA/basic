package axion.sakundoproject1.javacore.Gassociation.test;
import java.util.Scanner;
public class InputKeyboardDataTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int age = input.nextInt();
        char gender = input.next().charAt(0);
        System.out.println("------------------");
        System.out.println(name);
        System.out.println("------------------");
        System.out.println(age);
        System.out.println("------------------");
        System.out.println(gender);
        System.out.println("------------------");

    }
}
