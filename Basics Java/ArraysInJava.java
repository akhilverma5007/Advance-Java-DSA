import java.util.Arrays;
import java.util.Scanner;;
public class ArraysInJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //dattaype[] varName = new datatype[size];

        int[] rollnos = new int[5];
        int[] arr = {1,2,3,4,5};

        int[] ros; // declaration of array. -> Getting defined in the stack. -> Happens at compile time
        ros = new int[5]; // initialization of array. -> Actual memory crating in Heap. -> happens at run time(Dynamic memory allocation)

        System.out.println("Line 14: " + arr[0]);
        arr[0] = 99;
        System.out.println("Line 16: " + arr);

        int[] numb = new int[5];
        System.out.println("Line 19: " + Arrays.toString(numb)); //Gives [0, 0, 0, 0, 0]

        String[] str = new String[5];
        System.out.println("Line 22: " + Arrays.toString(str)); //Gives [null, null, null, null, null]

        int[] arr2 = new int[4];
        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;
        arr2[3] = 40;

        System.out.println("Line 30: " + Arrays.toString(arr2));
        
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Line 33: " + arr2[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = in.nextInt();
        }
        System.out.println("Line 40: " + Arrays.toString(arr2));
        System.out.println();

        //Enhanced for loop
        for(int j : arr2){
            System.out.print("Line 45: " + j + " ");
        }
        
        String[] newString = new String[2];
        for(int i = 0; i < newString.length; i++){
            newString[i] = in.next();
        }
        System.out.println("Line 52: " + Arrays.toString(newString));
 
    }
}
