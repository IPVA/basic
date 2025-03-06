package axion.sakundoproject1.javacore.Bintroductionmethods.domain;

public class Calculator {
    public void sumTwoNumbers(){
        System.out.println(10 + 10);
    }

    public void multiplyTwoNumbers(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double divideTwoNumbers(double num1, double num2) {
        if (num1 == 0 || num2 == 0){
            return 0;
        }
        return num1/ num2;
    }

    public void printTwoNumbersDivided(double num1, double num2){
        if(num2 == 0){
            System.out.println("Can't be divided");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void changeTwoNumbers(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Inside changeTwoNumbers");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }

    public void sumArrayNumbers(int[] numbers){
        System.out.println("---------------");
        int sum = 0;
        for(int n : numbers){
            sum += n;
        }
        System.out.println(sum);
    }

}
