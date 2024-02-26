
//Find minimum nuber in the array
public class LinearSearch_FindMinimumNumber {
    public static void main(String[] args) {
        int[] arr = {34,31,6,34,63,5};
        System.out.println(linearMinimumElement(arr));
        System.out.println(linearMaximumElement(arr));
    }

    static int linearMinimumElement(int[] arr){
        if(arr.length == 0){
            // return Integer.MIN_VALUE;
            return -1;
        }
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            
                if(arr[i] < minValue){
                    minValue = arr[i];
                }
        }
        return minValue;
    }

    static int linearMaximumElement(int[] arr){
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
