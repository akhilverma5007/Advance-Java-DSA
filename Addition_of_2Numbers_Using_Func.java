//Write a program to print the sum of two numbers entered by user by defining your own method.

import java.util.Scanner;

public class Addition_of_2Numbers_Using_Func {
    
    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);
    }

    static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int total = num1 + num2;
        return total;
    }
}
