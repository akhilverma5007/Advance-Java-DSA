public class Reverse_An_Array {
    public static void main(String[] args) {
        int[] arr = {23,44,56,33,51};
        swapArray(arr, 0, 1);
        System.out.println(java.util.Arrays.toString(arr));
        reverseArray(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void swapArray(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            swapArray(arr, start, end);
            start++;
            end--;
    }
}
    
}
