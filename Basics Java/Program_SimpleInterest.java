//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;

public class Program_SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double principal = in.nextFloat();
        System.out.print("Enter Rate: ");
        double rate = in.nextFloat();
        System.out.print("Enter Time: ");
        double time = in.nextFloat();

        double si = (principal * rate * time) / 100.00;
        System.out.println("Simple Interest is " + si);
    }
}
