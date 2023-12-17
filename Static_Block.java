//this is a demo to show initilization of static variables

public class Static_Block {
    static int a = 10;
    static int b;

    static{
        System.out.println("I am in static block.");
        b = a * 4;
    }

    public static void main(String[] args) {
        Static_Block sb = new Static_Block();
        System.out.println(Static_Block.a + " " + Static_Block.b);
    }
}
