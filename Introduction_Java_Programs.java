/*

1. Write a program to print whether a number is even or odd, also take
input from the user.
2. Take name as input and print a greeting message for that particular name.
3. Write a program to input principal, time, and rate (P, T, R) from the user and
find Simple Interest.
4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
(Use if conditions)
5. Take 2 numbers as input and print the largest number.
6. Input currency in rupees and output in USD.
7. To calculate Fibonacci Series up to n numbers.
8. To find out whether the given String is Palindrome or not.
9. To find Armstrong Number between two given number.

 */

import java.util.Scanner;
public class Introduction_Java_Programs {
    public static void main(String[] args){
        //1. Write a program to print whether a number is even or odd, also take input from the user.
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter a number to check whether its Even/Odd");
        int number = input.nextInt();
        if(number % 2 == 0){
            System.out.println(number + " is Even. ");
        }else{
            System.out.println(number + " is Odd. ");
        }
        System.out.println("");

        //2. Take name as input and print a greeting message for that particular name.
        System.out.println("Enter a name as input to show greeting message.");        
        String name = input.next();
        System.out.println("Hi " + name + ". Hope you doing good!. ");
        System.out.println("");

        //3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
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

        //4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        System.out.println("Enter two numbers and operator to calculate the output.");
        System.out.print("Enter First Number: ");
        int number1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int number2 = input.nextInt();
        System.out.print("Enter Operation you want to perform: (+,-,/,*) : ");
        double operator = input.next().charAt(0);

        if(operator == '+'){
            System.out.println(number1 + number2);
        }
        else if(operator == '-'){
            System.out.println(number1 - number2);
        }
        else if(operator == '*'){
            System.out.println(number1 * number2);
        }
        else if(operator == '/'){
            System.out.println(number1 / number2);
        }
        else{
            System.out.println("Invalid Input. ");
        }
        System.out.println("");

        //5. Take 2 numbers as input and print the largest number.
        System.out.println("Find the largest number.");
        System.out.print("Enter Number 1: ");
        int numb1 = input.nextInt();
        System.out.print("Enter Number 2: ");
        int numb2 = input.nextInt();

        if(numb1 > numb2){
            System.out.println(numb1 + " is largest");
        }
        else{
            System.out.println(numb2 + " is largest");
        }
        System.out.println("");

        //6. Input currency in rupees and output in USD.
        System.out.println("Enter currency to convert.");
        System.out.print("Enter amount: ");
        float amount = input.nextFloat();
        double conversion = amount * 83.33;
        System.out.println("USD Conversion is: " + conversion);
        System.out.println("");

        //7. To calculate Fibonacci Series up to n numbers.
        System.out.println("Enter a number to calculate Fibonacci Series: ");
        int n = 10;
        

    }
}
