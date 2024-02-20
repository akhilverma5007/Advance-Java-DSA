public class Shadowing {
    static int a = 30; //Everyone can access --- this will be shadowed at line 6
    public static void main(String[] args) {
        System.out.println(a); // 30
        int a = 20; // the class variable at line 2 is shadowed by this
        System.out.println(a); // 20
        fun();
    }

    static void fun(){
        System.out.println(a); // 30
    }
}
