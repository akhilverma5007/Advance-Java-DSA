//Define a method that returns the product of two numbers entered by user.
import java.util.Scanner;
public class Program_ProductOfTwoNumbersUsingMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers to find the product of them:\nEnter Number 1: ");
        int number1 = in.nextInt();
        System.out.print("Enter Number 2: ");
        int number2 = in.nextInt();
        System.out.println(product(number1, number2));
    }

    static int product(int num1, int num2){
        int prod = num1 * num2;
        return prod;
    }
}
