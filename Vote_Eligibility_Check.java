//A person is eligible to vote if his/her age is greater than or equal to 18. 
//Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;

public class Vote_Eligibility_Check {
    static int age;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age to check your eligibility to vote.");
        age = in.nextInt();
        vote();
    }    
    
    static void vote(){
        if(age >= 18){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
}
