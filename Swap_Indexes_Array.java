public class Swap_Indexes_Array{
    public static void main(String[] args) {
    int[] arr = {20,30,40,50,60};
        swap(arr, 0, 1);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}