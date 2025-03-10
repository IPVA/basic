package basic.introduction;

public class Class07Arrays03 {
    public static void main(String[] args) {
//         int[] numbers = new int[8];
         int[] numbers2 = {0,1,2,3,4,5,6,7};

         for(int i: numbers2){
             if( i % 2 == 0){
                 System.out.printf("%d\n", i);
             }

        }
    }
}
