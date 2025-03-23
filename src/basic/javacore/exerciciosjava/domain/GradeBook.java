package basic.javacore.exerciciosjava.domain;

import java.util.ArrayList;
import java.util.List;

public class GradeBook {

    public static char averageScore(int score1, int score2, int score3) {

        List<Integer> list = new ArrayList<>();
        list.add(score1);
        list.add(score2);
        list.add(score3);

        int average = 0;

        char result;

        for (int score : list) {
            average += score;
        }
        average =  average / 3 ;

        if (0 <= average && average < 60) {
            result = 'F';
        } else if (60 <= average && average < 70) {
            result = 'D';
        } else if (70 <= average && average < 80) {
            result = 'C';
        } else if (80 <= average && average < 90) {
            result = 'B';
        } else if (90 <= average && average < 100) {
            result = 'A';
        }else throw new IllegalArgumentException();


        System.out.println(result);

        return result;
    }


}
