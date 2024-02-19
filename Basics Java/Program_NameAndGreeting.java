import java.util.Scanner;

public class Program_NameAndGreeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your name ");
        String name = in.next();
        System.out.println("Welcome " + name + "! How are you.");
    }
}
