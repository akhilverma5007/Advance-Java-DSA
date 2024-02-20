
import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args) { //when you dont know the number of arguments
        fun(2,3,44,24,223);
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
