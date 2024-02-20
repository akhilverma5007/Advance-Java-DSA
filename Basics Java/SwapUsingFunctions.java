import java.util.Arrays;
public class SwapUsingFunctions {
    public static void main(String[] args) {
        // swap(100, 200);  
        int a = 10;
        int b = 20;

        swap2(a,b);
        System.out.println(a + " " + b);
        
        int[]arr = {1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    // static void swap(int value1, int value2){
    //     int temp = value1;
    //     value1 = value2;
    //     value2 = temp;
    //     System.out.println("Value of value1 is: " + value1);
    //     System.out.println("Value of value2 is: " + value2);
    //    }

    static void swap2(int a, int b){
        int temp = a;
        a = b;
        b = temp;  // Its not swapping because its not passing value its creating a new object
    }


    static void change(int[] nums){
        nums[0] = 99;  //original object value also be changed
    }
    
}
