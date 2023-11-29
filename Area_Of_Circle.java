//Area Of Circle Java Program

import java.util.Scanner;

public class Area_Of_Circle{
    public static void main(String[] args) {
        //Formula : Area=3.14×radius×radius

        Scanner input = new Scanner(System.in);
        System.out.println("Please provide me the radius: ");
        double radius = input.nextDouble();
        double area = 3.14 * radius * radius;

        System.out.println("Area of " + radius + " is " + area);


    }
}