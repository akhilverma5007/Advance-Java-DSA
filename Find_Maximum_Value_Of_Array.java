public class Find_Maximum_Value_Of_Array {
    public static void main(String[] args) {
    
        int[] arr = {23,42,55,3,56,31};
        System.out.println(max(arr));
        System.out.println("In Range " + maxRange(arr));
        System.out.println(maxRangeStartEnd(arr,1,3));
        
    }

    static int max(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

      static int maxRange(int[] arr){
        int maxValue = arr[0];
        for (int i = 1; i < 3; i++) {
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

      static int maxRangeStartEnd(int[] arr, int start, int end){
         //Edge cases
        if(end>start){
            return -1;
        }
        if(arr == null){
            return -1;
        }
        int maxValue = arr[start];
        for (int i = start; i <= end; i++) {
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
