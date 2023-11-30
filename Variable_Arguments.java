import java.util.Arrays;

public class Variable_Arguments {
    public static void main(String[] args) {
        func(10,20,30);
        multiple(1,2,"abc",3,3,3,5);

    }

    static void func(int ...a){
        System.out.println(Arrays.toString(a));
    }

    static void multiple(int a, int b, String d, int ...c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(d);
        System.out.println(Arrays.toString(c));
    }
}
