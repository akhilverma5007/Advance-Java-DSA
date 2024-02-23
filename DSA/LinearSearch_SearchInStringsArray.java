package DSA;

public class LinearSearch_SearchInStringsArray {
    public static void main(String[] args) {
    String[] names = {"rohit", "sonit", "shubham", "akhil", "govind"};       
    String target = "akhil";
    int retrurnIndex = LinearSearchNameIndex(names, target); 
    System.out.println("Index = " + retrurnIndex);

    String str = LinearSearchNameElement(names, target);
    System.out.println("Element = " + str);
    }


static int LinearSearchNameIndex(String[] names, String target){
    if(names.length == 0){ //names.equals(null)
        return -1;
    }

    for (int index = 0; index < names.length; index++) {
        String element = names[index];
        if(element == target){
            return index;
        }
    }
    return -1;
    }

    static String LinearSearchNameElement(String[] names, String target){
        if(names.length == 0){
            return null;
        }

       for (int i = 0; i < names.length; i++) {
            String element = names[i];
            if(target == element){
                return element;
            }
       }
       return null;
    }
}
