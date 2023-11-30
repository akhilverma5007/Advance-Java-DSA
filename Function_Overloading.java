import java.util.Arrays;

public class Function_Overloading {
    public static void main(String[] args) {
        fun(10);
        fun("Akhil");

        demo(1,2, 3);
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String a){
        System.out.println(a);
    }

    static void demo(int a, int b){
        System.out.println(a);
    }

    static void demo(int a, int ...v){
        System.out.println(a);
        System.out.println(Arrays.toString(v));
    }
}
