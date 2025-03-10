package basic.introduction;

public class Class08MultidimensionalArrays01 {
    public static void main(String[] args) {
        String[][] age = new String[3][3];
        age[0][0] = "A";
        age[0][1] = "B";
        age[0][2] = "C";
        age[1][0] = "D";
        age[1][1] = "E";
        age[1][2] = "F";

        for(int i = 0 ; i < age.length ; i++){
            for(int j = 0 ; j < age[i].length ; j++){
                System.out.printf("Letter %s\n", age[i][j]);
            }
        }
    }
}
