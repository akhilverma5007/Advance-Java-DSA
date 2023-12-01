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

public class Grade_Calculation {
    public static void main(String[] args) {
       grade();
   
  } 
  
  static void grade(){
     Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Marks: ");
        System.out.print("Subject 1: ");
            int sub1 = in.nextInt();
        System.out.print("Subject 2: ");
            int sub2 = in.nextInt();
        System.out.print("Subject 3: ");  
            int sub3 = in.nextInt();
        System.out.print("Subject 4: ");     
            int sub4 = in.nextInt();
        System.out.print("Subject 5: ");
            int sub5 = in.nextInt();

        int sum_of_5subjects = sub1 + sub2 + sub3 + sub4 + sub5;
        float percentage = sum_of_5subjects * 100 / 500;

        if(percentage >= 91 && percentage <= 100){
            System.out.println("Congratulations! Your overall percentage is : " + percentage + " and you've scored AA Grade.");
        }
        else if(percentage >= 81 && percentage <= 90){
            System.out.println("Congratulations! Your overall percentage is : " + percentage + " and you've scored AB Grade.");
        }
        else if(percentage >= 71 && percentage <= 80){
            System.out.println("Congratulations! Your overall percentage is : " + percentage + " and you've scored BB Grade.");
        }
        else if(percentage >= 61 && percentage <= 70){
            System.out.println("Congratulations! Your overall percentage is : " + percentage + " and you've scored BC Grade.");
        }
        else if(percentage >= 51 && percentage <= 60){
            System.out.println("Congratulations! Your overall percentage is : " + percentage + " and you've scored CD Grade.");
        }
        else if(percentage >= 41 && percentage <= 50){
            System.out.println("Congratulations! Your overall percentage is : " + percentage + " and you've scored DD Grade.");
        }
        else if(percentage <= 40){
            System.out.println("Congratulations! Your overall percentage is : " + percentage + " and you've Failed.");
        }
        else{
            System.out.println("Invalid Percentage");
        }
  }
   
}