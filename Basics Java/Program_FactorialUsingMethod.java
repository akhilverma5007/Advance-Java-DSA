/*
Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
4! = 1 * 2 * 3 * 4 = 24 
3! = 3 * 2 * 1 = 6 
2! = 2 * 1 = 2 
Also, 
1! = 1 
0! = 1
*/

import java.util.Scanner;

public class Program_FactorialUsingMethod {
    static int temp = 1;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        factorial(num);

    }

    static void factorial(int num){
        for (int i = 1; i <= num; i++) {
            temp = temp * i;
        }
        System.out.println(temp);
    }
}
