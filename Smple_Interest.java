//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class Smple_Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter principal, time, and rate to calculate Simple Interest");
        System.out.println("Enter Principal Amount: ");
        double principal = input.nextDouble();
        System.out.println("Enter Rate of Interest: ");
        double rate = input.nextDouble();
        System.out.println("Enter Time: ");
        double time = input.nextDouble();

        double si = (principal * rate * time) / 100;
        System.out.println("The S.I is : " + si);
        System.out.println("");

    }
}
