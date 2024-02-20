//Area Of Circle Java Program

import java.util.Scanner;

public class Program_AreaOfA_Cicle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Program to calculate Area OF A Triangle. ");
        System.out.println("Enter radius? ");
        double r = in.nextDouble();
        double area = Math.PI * r * r;
        System.out.println("Area of circle is : " + area);
    }
}
