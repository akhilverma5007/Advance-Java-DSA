
import java.util.Arrays;;
public class LinearSearch_SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {10,20,30},
            {23,44},
            {4,55},
        };
        int target = 44;
        int[] result = linear2DSearch(arr, target);
        System.out.println(Arrays.toString(result));

        System.out.println(linear2DSearchMaximum(arr));
    }

    static int[] linear2DSearch(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[row].length; col++) {
                    if(arr[row][col] == target){
                        return new int[]{row, col};
                    }
                }
        }
        return new int[]{-1, -1};
    } 

    static int linear2DSearchMaximum(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    } 
}
