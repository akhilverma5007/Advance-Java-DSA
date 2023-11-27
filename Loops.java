import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
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
