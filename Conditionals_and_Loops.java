import java.util.Scanner;

public class Conditionals_and_Loops {
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
    
        //Loops
        //Print no's 1 to 5 using for loop
        System.out.println("");
        System.out.println("Printing no's 1 to 5: ");
        for(int i = 0; i < 5; i++){
            System.out.print(i + " ");
        }
        System.out.println("");

        //Print no's 1 to n
        System.out.println("");
        System.out.print("Printing no's 1 to n: ");
        int n = in.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");

        //Print no's 1 to 5 using while loop
        System.out.println("");
        System.out.println("Printing No's 1 to 5 using while loop");
        int j = 0;
        while(j < 5){
            System.out.print(j + " ");
            j++;
        }
        System.out.println("");

        //Print no's 1 to 5 using do while loop
        System.out.println("");
        System.out.println("Printing no's 1 to 5 using do while loop");
        int d = 0;
        do{
            System.out.print(d + " ");
            d++;
        }while(d < 5);
    }
        
}
