/*
Write a program that will ask the user to enter his/her marks (out of 100). 
Define a method that will display grades according to the marks entered as below:
Marks        Grade 
91-100         AA 
81-90          AB 
71-80          BB 
61-70          BC 
51-60          CD 
41-50          DD 
<=40          Fail 
 */
import java.util.Scanner;

public class Program_GradesUsingMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int marks = in.nextInt();
        grades(marks);
    }

    static void grades(int marks){
        if(marks >= 91 && marks <= 100){
            System.out.println("You've scored Grade AA.");
        }
        if(marks >= 81 && marks <= 90){
            System.out.println("You've scored Grade AB.");
        }
        if(marks >= 71 && marks <= 80){
            System.out.println("You've scored Grade BB.");
        }
        if(marks >= 61 && marks <= 70){
            System.out.println("You've scored Grade BC.");
        }
        if(marks >= 51 && marks <= 60){
            System.out.println("You've scored Grade CD.");
        }
        if(marks >= 41 && marks <= 50){
            System.out.println("You've scored Grade DD.");
        }
        if(marks <= 40){
            System.out.println("You've Failed.");
        }
        
    }
}
