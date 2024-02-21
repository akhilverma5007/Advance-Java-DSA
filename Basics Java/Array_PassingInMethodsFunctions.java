import java.util.Arrays;

public class Array_PassingInMethodsFunctions{
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        System.out.println(Arrays.toString(arr));
        arrayFunc(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void arrayFunc(int[] arr){
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        arr[3] = 400;
    }
}