//Define a program to find out whether a given number is even or odd.

import java.util.Scanner;

public class Odd_even_using_func {
    static int num;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        even_odd();
    }    

    static void even_odd(){
        if(num % 2 == 0){
            System.out.println(num + " is Even.");
        }else{
            System.out.println(num + " is Odd.");
        }

    }
}
