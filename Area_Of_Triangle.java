//Area Of Triangle

import java.util.Scanner;

public class Area_Of_Triangle {
    public static void main(String[] args) {
            //Area = 1/2 × base × height
        Scanner input = new Scanner(System.in);
        System.out.println("Program to calculate Area of Triangle.");
        System.out.println("Please provide base value: ");
        double base = input.nextDouble();
        System.out.println("Please provide height: ");
        double height = input.nextDouble();

        double area = 1/2 * base * height;
        System.out.println("Area of Triangle is: " + area);
    }

}
