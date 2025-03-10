package basic.javacore.arraylist.test;

import java.util.Scanner;


public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList list = new java.util.ArrayList();

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Type a number: ");
            int num = input.nextInt();

            list.add(num);
        }

        System.out.println(list);

    }


}
