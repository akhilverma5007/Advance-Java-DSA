import java.util.Scanner;

public class Program_CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        if(ch >= 'A' && ch <='Z'){
            System.out.println("String is Uppercase");
        }
        else if(ch >= 'a' && ch <='z'){
            System.out.println("String is Lowercase");
        }
    }
}
