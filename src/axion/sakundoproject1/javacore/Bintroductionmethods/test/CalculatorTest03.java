package axion.sakundoproject1.javacore.Bintroductionmethods.test;
import axion.sakundoproject1.javacore.Bintroductionmethods.domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = calculator.divideTwoNumbers(2235,23);
        System.out.println(result);

        System.out.println("------------------------");
        calculator.printTwoNumbersDivided(23, 0);
    }

}
