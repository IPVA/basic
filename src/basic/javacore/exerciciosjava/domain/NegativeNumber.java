package basic.javacore.exerciciosjava.domain;

import java.util.Arrays;
import java.util.Collections;

public class NegativeNumber {


    public int inverseNumber(int number){

        String[] array = String.valueOf(number).split("");

        Arrays.sort(array, Collections.reverseOrder());

        int finalNumber = Integer.parseInt(String.join("", array));

        System.out.println(finalNumber);

        return finalNumber;

    }

}
