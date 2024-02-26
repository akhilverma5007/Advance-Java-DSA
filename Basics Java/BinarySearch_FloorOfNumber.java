

public class BinarySearch_FloorOfNumber {
    public static void main(String[] args) {
        //Find the floor of a number
        //Floor = greatest number smaller or = target

        int[] arr = {2,3,5,9,14,16,18};
        int target = 22;
        System.out.println(findFloorOfNumber(arr,target));

    }

    static int findFloorOfNumber(int[] arr, int target){
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
        return end;
    }
   
}

