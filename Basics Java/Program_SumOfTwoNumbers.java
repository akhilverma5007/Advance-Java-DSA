import java.util.Scanner;

public class Program_SumOfTwoNumbers {
    public static void main(String[] args){
        System.out.println("Please input two numbers! ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int num1 = input.nextInt();
        System.out.println("Enter Number 2: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of two numbers is: " + sum);
    }
}
