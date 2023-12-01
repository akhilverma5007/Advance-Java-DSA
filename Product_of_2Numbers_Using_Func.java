//Define a method that returns the product of two numbers entered by user.

import java.util.Scanner;

public class Product_of_2Numbers_Using_Func {
    public static void main(String[] args) {
        int ans = product();
        System.out.println(ans);
    }
    static int product(){
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int product_sum = num1 * num2;
        return product_sum;
    }
}
