package axion.sakundoproject1.introduction;

public class Class08MultidimensionalArrays02 {
    public static void main(String[] args) {
        String[][] age = new String[3][3];
        age[0][0] = "A1";
        age[0][1] = "B1";
        age[0][2] = "C1";
        age[1][0] = "D1";
        age[1][1] = "E1";
        age[1][2] = "F1";

        for (String[] spaceArray : age){
            for (String deepSpaceArray: spaceArray){
                System.out.println(deepSpaceArray);
            }
        }

    }
}
