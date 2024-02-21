//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

import java.util.Scanner;

public class Program_MaximumMinimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers to check maximum and minimum among numbers? ");
        System.out.print("Enter number 1: ");
        int number1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int number2 = input.nextInt();
        System.out.print("Enter number 3: ");
        int number3 = input.nextInt();

        int maxNumber = maximum(number1, number2, number3);
        int minNumber = minimum(number1, number2, number3);

        System.out.println("Maximum number is " + maxNumber);
        System.out.println("Minimum number is " + minNumber);
    }

    static int maximum(int num1, int num2, int num3){
        if(num1 > num2 && num1 > num3){
            return num1;
        }if(num2 > num1 && num2 > num3){
            return num2;
        }if(num3 > num1 && num3 > num2){
            return num3;
        }else {
            System.out.println("Two of the given inputs are equal among three.");
            return 0;
        }
    }

    static int minimum(int num1, int num2, int num3){
        if(num1 < num2 && num1 < num3){
            return num1;
        }if(num2 < num1 && num2 < num3){
            return num2;
        }if(num3 < num1 && num3 < num2){
            return num3;
        }else {
            System.out.println("Two of the given inputs are equal among three.");
            return 0;
        }
    }
}