//Given an array nums of integers, return how many of them contain an even number of digits.


public class LinearSearch_EvenDigits {
    public static void main(String[] args) {
        int[] arr = {18,124,9,1764,98,1};
        even(arr);
    }
    

    static void even(int[] arr){
        int count = 0;
        for (int each : arr) {
            int length = String.valueOf(each).length();
            if(length % 2 == 0){
                count+=1;
            }
        }
        System.out.println("No of Even digits in arr is : " + count);
    }
}
