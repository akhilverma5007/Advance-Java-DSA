import java.util.Scanner;

public class Main { //Class
//public(means this class can be accessed ftom anywhere) -> Access Modifier   
    public static void main(String[] args){ //main function/method
        //static: if we want to run this main function without creating a instance(object) of the Main class we use static keyword
        //void: return type (null)
        //String[] args: Command Line Argument (args[0]) input: java Main 10 20
        
        // OUTPUT
        //System.out.println(args[1]);
        System.out.println("Hello World! ");

        // INPUT
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println(name);
    }
}