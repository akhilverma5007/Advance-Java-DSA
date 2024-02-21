import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList_InJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Syntax
        //Wrapper Class 
        ArrayList<Integer> list = new ArrayList<Integer>(10); //Constructor
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list.contains(30));
        System.out.println(list.addAll(list));
        System.out.println(list);

        //input
        for(int i = 0; i < 5; i++){
            list.add(in.nextInt());
        }

        // get itema t any index
        for(int i = 0; i < 5; i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
