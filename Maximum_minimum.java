//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

import java.util.Scanner;

public class Maximum_minimum {
    static int num1;
    static int num2;
    static int num3;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 numbers to compare maximum and minimum: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        int max_num = max();
        System.out.println("maximum no is: " + max_num);

        int min_num = min();
        System.out.println("minimum no is: " + min_num);
    }

    static int max(){
        int max = 0;
        if(num1 > num2 && num1 > num3){
            max = num1;
        }
        else if(num2 > num3 && num2 > num1){
            max = num2;
        }
        else if(num3 > num1 && num3 > num2){
            max = num3;
        }
        else if(num1 == num2 && num2 == num3){
            System.out.println("all three are equal");
            max = num1;
        }
        else if(num1 == num2){
            System.out.println("num1 and num2 are equal");
            max = num1;
        }
        else if(num1 == num3){
            System.out.println("num1 and num3 are equal");
            max = num1;
        }
        else if(num2 == num3){
            System.out.println("num2 and num3 are equal");
            max = num3;     
        }
        return max;
    }

    static int min(){
        int min = 0;
        if(num1 < num2 && num1 < num3){
            min = num1;
        }
        else if(num2 < num3 && num2 < num1){
            min = num2;
        }
        else if(num3 < num1 && num3 < num2){
            min = num3;
        }
        else if(num1 == num2 && num2 == num3){
            System.out.println("all three are equal");
            min = num1;
        }
        else if(num1 == num2){
            System.out.println("num1 and num2 are equal");
            min = num1;
        }
        else if(num1 == num3){
            System.out.println("num1 and num3 are equal");
            min = num1;
        }
        else if(num2 == num3){
            System.out.println("num2 and num3 are equal");
            min = num3;     
        }
        return min;
    }
    
}
