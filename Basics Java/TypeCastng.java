import java.util.Scanner;

public class TypeCastng {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        int convertedText = Integer.parseInt(name);
        System.out.println(name);

        //Automatic type promotion
        int a = 257;
        byte b = (byte)(a);
        System.out.println(b);
    }
}
