

public class BinarySearch_CeilingOfNumber {
    public static void main(String[] args) {
    //Question arr = [2,3,5,9,14,16,18], target = 15
    //Ceiling = smallest element in array greater or = target element

    //Ceiling(arr,target = 14) = (ans)14
    //Ceiling(arr,target = 15) = (ans)16
    //Ceiling(arr,target = 4) = (ans)5

    int[] arr = {2,3,5,9,14,16,18};
    int target = 15;
    System.out.println(findCeilingOfNumber(arr,target));
    
    }

    static int findCeilingOfNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid -1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
   
}
