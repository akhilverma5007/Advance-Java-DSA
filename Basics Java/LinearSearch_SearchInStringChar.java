

public class LinearSearch_SearchInStringChar {
    public static void main(String[] args) {
        String name = "akhil";
        char target = 'h';
        System.out.println(linearCharacterSearch(name, target));
        System.out.println(linearCharacterSearch2(name, target));

    }

    static boolean linearCharacterSearch(String name, char target){
        //length -> variable
        //length() -> function which contains a variable length 
        if(name.length() == 0){
            return false;
        }

        for(int i = 0; i < name.length(); i++){
            if(target == name.charAt(i)){
                // System.out.println("Element = " + target);
                System.out.println("Index = " + i);
                return true;
            }
        }
        return false;
    }

    static boolean linearCharacterSearch2(String name, char target){
        if(name.length() == 0){
            return false;
        }

        for (char ch : name.toCharArray()) { //output ['a','k','h','i','l']
            if(ch == target){
                System.out.println("Element = " + ch);
                return true;
            }
        }
        return false;
    }
}
