package axion.sakundoproject1.introduction;

public class Class08MultidimensionalArrays03 {
    public static void main(String[] args){
        int[] january = {1};
        int[] february = {2};
        int[] march = {3};
        int[] april = {4};
        int[] may = {5};

        int[][] year = new int[6][];
        year[0] = january;
        year[1] = february;
        year[2] = march;
        year[3] = april;
        year[4] = may;
        year[5] = new int[]{0,4,6};

        for (int[] spaceArray: year){
            for (int deepSpaceArray: spaceArray){
                System.out.print(deepSpaceArray);
            }
        }
        System.out.printf("\n--------------\n %d",year[5].length);

    }
}
