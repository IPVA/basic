package axion.sakundoproject1.javacore.Bintroductionmethods.test;
import axion.sakundoproject1.javacore.Bintroductionmethods.domain.Calculator;

public class CalculatorTest04 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int num1 = 1;
        int num2 = 2;
        calculator.changeTwoNumbers(num1, num2);
        System.out.println("Inside CalculatorTest04");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}
