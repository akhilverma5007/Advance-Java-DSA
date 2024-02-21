//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

import java.util.Scanner;

public class Program_CircumOfCircle{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius to check area of circle");
        double radius = in.nextDouble();
        circle(radius);      
    }

    static void circle(double radius){
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle is: " + area);
        System.out.println("Circumference of Circle is: " + circumference);
    }
}