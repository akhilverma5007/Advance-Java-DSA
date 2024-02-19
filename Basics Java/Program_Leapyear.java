//Input a year and find whether it is a leap year or not.

import java.util.Scanner;

public class Program_Leapyear {
    public static void main(String[] args){
        System.out.println("Please input a year to check if it's Leap Or Not! ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        if(year % 4 == 0 & year % 100 != 0 || year % 400 == 0){
            System.out.println("It's a Leap year. ");
        }else{
            System.out.println("Oops Sorry is not a Leap Year. Please try Again");
        }
    }
}