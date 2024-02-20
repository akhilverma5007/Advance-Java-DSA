//Input a number and print all the factors of that number (use loops).
import java.util.Scanner;

public class Program_FactorsOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = in.nextInt();
        for (int i = 1; i <= number; ++i) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
