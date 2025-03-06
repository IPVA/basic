package axion.sakundoproject1.introduction;

public class Class8MultidimensionalArrays03Part2 {
    public static void main(String[] args) {
        int[][] age = {{1,3},{5,2,7,8},{44,65,76,78,33,754,256}};
        for(int[] spaceArray: age) {
            System.out.println("\n-----------");
            for(int deepSpaceArray : spaceArray){
                System.out.print(deepSpaceArray + " ");
            }
        }
    }
}
