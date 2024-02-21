//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
import java.util.Scanner;

public class Program_EligibilityToVote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter age to check Eligibility to vote! ");
        int ageCheck = in.nextInt();
        voteEligibility(ageCheck);
    }

    static void voteEligibility(int age){
        if(age >= 18){
            System.out.println("You're Eligible to vote.");
        }else{
            System.out.println("You're not Eligible to vote.");
        }
    }
}
