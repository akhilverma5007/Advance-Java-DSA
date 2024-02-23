package DSA;

public class LinearSearch{
    public static void main(String[] args) {
    
    int[] arr = {18, 12, 9, 14, 77, 50};
    int target = 14;
    //Problem Whether 14 exists in array or not
    
    int returnIndex = linearSearch_ReturnTheIndex(arr, target);
    System.out.println("Index = " + returnIndex);
    
    int returnElement = linearSearch_ReturnTheElement(arr, target);
    System.out.println("Element = " + returnElement);
    }

    //search in the array: retun the index if item found
    //otherwise if item not found return -1
    static int linearSearch_ReturnTheIndex(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int index = 0; index < arr.length; index++){
            //check for element at every index if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        // this line will execute if none of the return statements above have executed
        //hence the target not found
        return -1; //index will never be -1 (as it starts with 0 always)
        // return Integer.MAX_VALUE;
    }

    static int linearSearch_ReturnTheElement(int[] arr, int target){
        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }
        for (int i = 0; i < arr.length; i++) {
        int element = arr[i];
            if(element == target){
                return element;
            }
        }
        return Integer.MAX_VALUE; //here we cant use -1 because value of element can be -1
    }
    
}
