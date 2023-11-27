import java.util.Scanner;

public class Conditional_Statements {
    public static void main(String[] args){
        //Conditions
        //if-else
        System.out.println("");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Salary? ");
        int salary = in.nextInt();
        if(salary > 10000){
            salary += 2000;
            System.out.println("Salary after bonus is: " + salary);
        }else{
            salary += 1000;
            System.out.println("Salary after bonus is: " + salary);
        }
        System.out.println("");
        
        //Multiple if-else
        System.out.print("Enter Your Pay? ");
        int pay = in.nextInt();
        if(pay > 5000){
            pay += 5000;
            System.out.println("Your pay is after adding bonus is " + pay);
        }else if(pay > 10000){
            pay += 10000;
        }else{
            System.out.println("Invalid Output.");
        }        
    }
        
}
