// import java.util.Arrays;
import java.util.Scanner;

public class Arrays{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        // int[] rollnos = new int[5];
        // int[] rollnos2 = {23,4,56,43,34};

        // System.out.println(rollnos2[2]);
        // System.out.println(rollnos[4]);

        // String[] str = new String[5];
        // System.out.println(str[3]);

        int[] newArray = new int[10];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = in.nextInt();
        }

        //THREE WAYS TO PRINT THIS

        // 1
        // for (int i = 0; i < newArray.length; i++) {
        //     System.out.print(newArray[i] + " " );
        // }

        // 2
        for(int each : newArray){
            System.out.print(each + " ");
        }

        // System.out.println(newArray[11]); //ArrayIndexOutOfBounds Error
        // 3
        // System.out.println(Arrays.toString(newArray));
        System.out.println(java.util.Arrays.toString(newArray));


        //For Non-Primitives-> String

        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(java.util.Arrays.toString(str));

        //ARRAYS IN FUNCTIONS

        //THIS is MUTABLE BEHAVIOUR(Original object will also be changed)
        int[] originalStringValue = {1,2,3,4,5};
        System.out.println(java.util.Arrays.toString(originalStringValue));
        changeValueInArray(originalStringValue);
        System.out.println(java.util.Arrays.toString(originalStringValue));

    }        
        static void changeValueInArray(int[] arr){
            arr[2] = 100;
        }
    
}