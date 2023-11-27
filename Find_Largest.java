import java.util.Scanner;

public class Find_Largest {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

    // Take 2 numbers as input and print the largest number.
         System.out.println("Find the largest number.");
         System.out.print("Enter Number 1: ");
         int numb1 = input.nextInt();
         System.out.print("Enter Number 2: ");
         int numb2 = input.nextInt();
 
         if(numb1 > numb2){
             System.out.println(numb1 + " is largest");
         }
         else{
             System.out.println(numb2 + " is largest");
         }
         System.out.println("");

    // Question: Find the largest of the 3 no's

        System.out.print("Enter First number: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter Second number: ");
        int num2 = input.nextInt();        
   
        System.out.print("Enter Third number: ");
        int num3 = input.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " : First no is greater.");
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println(num2 + " : Second no is greater.");
        }
        else if(num3 > num1 && num3 > num2){
            System.out.println(num3 + " : Third no is greater.");
        }
        else if(num1 == num2 && num1 != num3){
            System.out.println(num1 + " : no'1 and " + num2 + " : no'2 are Equal.");
        }
        else if(num2 == num3 && num2 != num1){
            System.out.println(num2 + " : no'2 and " + num3 + " : no'3 are Equal.");
        }
        else if(num1 == num3 && num1 != num2){
            System.out.println(num1 + " : no'1 and " + num3 + " : no'3 are Equal.");
        }
        else if(num1 == num2 && num2 == num3){
            System.out.println(num1 + " : no'1 and " + num2 + " : no'2 and " + num3 + " : no'3 all are Equal.");
        }
        else{
            System.out.println("invalid Input.");
        }

        //ANOTHER SIMPLE WAY TO DO THIS
        System.out.println("");
        System.out.print("Enter three numbers:  ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // int max = a;
        // if(b > max){
        //     max = b;
        // }if(c > max){
        //     max = c;
        // }
        // System.out.println(max);

       int max = Math.max(a,b);
       int output = Math.max(max, c);
       System.out.println(output);
    }
}
