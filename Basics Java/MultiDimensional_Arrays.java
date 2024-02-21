import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional_Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 2-D Arrays (multi-dimensional array)
        int[][] arr1 = new int[3][];

        int[][] arr2 = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        
        int[][] arr3 = {
            {1,2,3,4},  //0th Index
            {5,6},      //1st Index
            {7,8,9},    //2nd Index
        };
        // System.out.println(arr.length);
        // System.out.println(arr.length);

        int[][] arr = new int[3][3];
        System.out.println(arr.length); // no of rows
        
        // input
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr.length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        //output
        //1st Way
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr.length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        //2nd Way
        //Insted of above output loop you can also do
        for (int row = 0; row < arr.length; row++) {
        System.out.println(Arrays.toString(arr[row]));
        }

        //3rd Way
        //Enhanced For Loop
        for (int[] each : arr) {
            System.out.println(Arrays.toString(each));
        }

        // int[][] arr4 = {
        //     {1,2,3},
        //     {2,3,3},
        //     {2,3,3}
        // };


        // for(int row = 0; row < arr4.length; row++){
        //     for (int col = 0; col < arr4.length; col++) {
        //         System.out.print(arr4[row][col] + " ");
        //     }
        //     System.out.println();
        // }


        //When column no is fixed (Dynmaic Arrays)

        int[][] arr5 = {
            {1,2,3,4},
            {4,5,6,7},
            {3,4,2},
        };

        for(int row = 0; row < arr5.length; row++){
            for(int col = 0; col < arr5[row].length; col++){
                System.out.print(arr5[row][col] + " ");
            }
            System.out.println();
        }
        
}
}
