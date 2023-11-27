import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
            System.out.println(ch);

            if(ch >= 'A' && ch <= 'Z'){
                System.out.println(ch + " is Uppercase");
            }else{
                System.out.println(ch + " is Lowercase");
            }
        
    }
    
}
