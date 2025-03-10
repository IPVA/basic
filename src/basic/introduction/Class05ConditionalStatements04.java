package basic.introduction;

public class Class05ConditionalStatements04 {
    public static void main(String[] args) {
        /*  how much I have to pay in the Netherlands based on my annual salary

        From        up to and including         Tax per bracket
        0           34.712                      9.70%
        34.713      68.507                      37.35%
        68.508      >                           49.50%

         */
        double annualSalary = 40000;
        String Message;
        if (annualSalary >= 0 && annualSalary <= 34712) {
            Message = "You have to pay 9.70% of tax";
        }else if (annualSalary >= 34713 && annualSalary <= 68507) {
            Message = "You have to pay 37.35% of tax";
        }
        else {
            Message = "You have to pay 49.50% of tax";
        }
        System.out.println(Message);

    }
}
