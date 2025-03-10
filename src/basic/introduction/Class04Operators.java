package basic.introduction;

public class Class04Operators {
    public static void main(String[] args) {
        boolean isTenLowerThanTwenty = true;
        System.out.println("isTenLowerThanTwenty: " + isTenLowerThanTwenty);

        double currentAccount = 235.00;
        double savingsAccount = 5059;
        float bunProSubscription = 450.0F;
        boolean canBeBought = currentAccount > bunProSubscription || savingsAccount > bunProSubscription;
        System.out.println("canBeBought: " + canBeBought);

        double count = 10;
        count = 20;
        System.out.println(count);

    }
}
