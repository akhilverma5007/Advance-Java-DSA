public class Inheritance_Main {
  
    public static void main(String[] args) {
        // Inheritance_Box child = new Inheritance_Box(10.00,20.30,45.00);
        Inheritance_Box box1 = new Inheritance_Box();
        Inheritance_Box box2 = new Inheritance_Box(box1);

        System.out.println(box2.height);

        Inheritance_BoxWeight box3 = new Inheritance_BoxWeight();
        System.out.println(box3.height + " " + box3.weight );

        
    }
}
