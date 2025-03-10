package basic.javacore.exerciciosjava.test;

import basic.javacore.exerciciosjava.domain.Female;
import basic.javacore.exerciciosjava.domain.Humans;
import basic.javacore.exerciciosjava.domain.Male;

public class HumanTest {
    public static void main(String[] args) {
        Humans allHumans = new Humans();

        Male male1 = new Male("Sakundo", 1.78F, 'M');
        Male male2 = new Male("Agaroth", 1.88F, 'M');
        Male male3 = new Male("Shadow", 1.78F, 'M');
        Female female1 = new Female("Shaiko", 1.68F, 'F');
        Female female2 = new Female("Hitsuri Mei", 1.64F, 'F');


        allHumans.setHumans(new Humans[]{male1, male2, male3, female1, female2});

        allHumans.print();
        System.out.println("\n-------------------------");
        male1.print();

    }

}
