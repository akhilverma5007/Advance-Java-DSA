//Subtract the Product and Sum of Digits of an Integer

import java.util.Scanner;

public class Program_ProductAndSum {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter the digit you want to sum and product further: ");
        int num = input.nextInt();
        String numberString = Integer.toString(num);

        int sum = 0;
        int product = 1;
        for (int i = 0; i < numberString.length(); i++) {
            char eachDigit = numberString.charAt(i);
            int intConversion = Character.getNumericValue(eachDigit);
            product *= intConversion;
            sum += intConversion;
            }
        System.out.println("Product of the given number is: " + product);
        System.out.println("Sum of the given number is: " + sum);

        int result = product - sum;
        System.out.println("Result is : " + result);
   } 
}
