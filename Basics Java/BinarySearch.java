

public class BinarySearch {
    public static void main(String[] args) {
        // int[] arr = {-18,-55,2,3,4,5,6,7,8,9,12,15, 18, 22}; //ascending order
        int[] arr = {58,55,32,12,15,9,7,6,4}; //descending order

        int target = 15;
        int ans = binarySearchCheck(arr, target);
        System.out.println("Index :" + ans);
    }

    //return the index
    //return -1 if it does not exist
    static int binarySearchCheck(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        //find whether the array is sorted in ascending or descending
        // boolean isAsc;
        // if(arr[start] < arr[end]){
        //     isAsc = true;
        // }else{
        //     isAsc = false;
        // }

        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            //find the middle element
            //int mid = start + end / 2; 
            // might be possible that (start + end) exceeds the range of int in java

            //Better way
            int mid = start + (end - start) / 2;
            
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        //means item not exist
        return -1;
    }
}
