public class Program_ToFindMaximumValueInArray {
    public static void main(String[] args) {
        int[] arr = {123,535,464,322,434,33,44,405};
        System.out.println(max(arr));
        System.out.println(maxValueInRange(arr, 2, arr.length));
    }

    //in case of array is not empty
    static int max(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        
        int maxValue = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    //in range
    static int maxValueInRange(int[] arr, int start, int end){

        //edge cases
        if(end>start){
            return -1;
        }
        if(arr == null){
            return -1;
        }

        int maxValue = arr[0];
        for(int i = start; i < end; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
