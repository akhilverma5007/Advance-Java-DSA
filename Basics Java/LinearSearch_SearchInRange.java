

public class LinearSearch_SearchInRange {
    public static void main(String[] args) {
        int[] arr = {10,23,53,22,67,44,34};
        int start = 1;
        int end = 4;
        int target = 34;
        System.out.println(searchInRange(arr, start, end, target));
    }

    static int searchInRange(int[] arr, int start, int end, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int i = start; i <= end; i++){
            int element = arr[i];
            if(element == target){
                return target;
            }
        }
        return -1;
    }
}
