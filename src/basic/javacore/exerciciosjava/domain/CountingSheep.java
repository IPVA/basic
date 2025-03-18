package basic.javacore.exerciciosjava.domain;

public class CountingSheep {

    public static int totalOfSheep() {

        boolean[] allSheep = new boolean[]{true,  false,  false,  false,
                true,  true,  false,  false ,
                true,  true, true,  false,
                true,  true, false, true ,
                false,  false,  true,  true ,
                false, false, false,  false};

        int count = 0;

        for (boolean sheep: allSheep) {

            if (sheep) {

                count++;
            }

        }

        return count;
    }
}
