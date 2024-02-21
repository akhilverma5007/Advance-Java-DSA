//Write a program to print the sum of two numbers entered by user by defining your own method.
import java.util.Scanner;

public class Program_SumOfTwoNumbersUsingMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your numbers to sum.");
        System.out.print("Enter Number 1: ");
        int number1 = in.nextInt();
        System.out.print("Enter Number 2: ");
        int number2 = in.nextInt();
        System.out.println(sum(number1, number2));
    }

    static int sum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
}
