package basic.javacore.Bintroductionmethods.test;
import basic.javacore.Bintroductionmethods.domain.Calculator;

public class CalculatorTest05 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int[] arrayNumbers = {1,3,6,8,5};
        calculator.sumArrayNumbers(arrayNumbers);
    }
}
