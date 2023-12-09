import java.util.Scanner;

public class TwoDimensional_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
            1 2 3 
            4 5 6
            7 8 9
         */

        // Syntax:-

        int[][] arr = new int[3][]; //no of rows are mandaory
                                    //no of columns to add is optional

        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        
        int[][] array2D = { 
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };

        System.out.println(arr.length);

        //Input in array
        int[][] array2DloopTesting = new int[3][3];
        //here we taking every row
        for (int row = 0; row < array2DloopTesting.length; row++) {
            //for each col in every row
            for (int col = 0; col < array2DloopTesting[row].length; col++) {
                array2DloopTesting[row][col] = in.nextInt();
            }
        }

        //Output in array
        for (int row = 0; row < array2DloopTesting.length; row++) {
            //for each col in every row
            for (int col = 0; col < array2DloopTesting[row].length; col++) {
                System.out.print(array2DloopTesting[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();



        //Another way to Output
        for(int row = 0; row < array2DloopTesting.length; row++){
            System.out.println(java.util.Arrays.toString(array2DloopTesting[row]));
        }
        System.out.println();

        //Using Enhanced for loop
        for(int[] ar : array2DloopTesting){
            System.out.println(java.util.Arrays.toString(ar));
        }
    }
}
