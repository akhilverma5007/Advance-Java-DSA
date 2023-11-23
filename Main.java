import java.util.Scanner;
//class
public class Main {
    //main function where writing of code begins
    //All the functions which are in classes are known as methods
    public static void main(String[] args){
        // System.out.println("Hello World!");
        //System.out.println(args[1]);

        Scanner input = new Scanner(System.in);
        if(input.hasNextInt()){
            int num = input.nextInt();
            System.out.println(num);
        }else{
            System.out.println("Invalid Input");
        }

        //Type Conversion
        float num1 = input.nextFloat();
        System.out.println(num1);

        //Type Casting
        int num2 = (int)(244.343f);
        System.out.println(num2);

        //Automatic type promotion in expressions
        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = (a * b) / c;
        System.out.println(d);
    }
}
