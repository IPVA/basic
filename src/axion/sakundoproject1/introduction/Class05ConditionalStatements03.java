package axion.sakundoproject1.introduction;

public class Class05ConditionalStatements03 {
    public static void main(String[] args) {
        // if my salary is > 2000 "Buy Ps5" "Don't buy Ps5"

        String buyProduct = "Buy Ps5";
        String dontBuyProduct = "Don't Buy Ps5";
        double salary = 1600D;

        String showMenssage = salary > 2000 ? buyProduct : dontBuyProduct;



        System.out.println(showMenssage);

    }
}
