//Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class Program_LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers to check which one is largest");
        System.out.println("Enter number 1:");
        int num1 = in.nextInt();
        System.out.println("Enter number 2:");
        int num2 = in.nextInt();
        if(num1>num2){
            System.out.println(num1 + " is Largest");
        }else{
            System.out.println(num2 + " is Largest");
        }
    }
}
