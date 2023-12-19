public class Polymorphism_Main {
    public static void main(String[] args) {
        Polymorphism_Shapes shapes = new Polymorphism_Shapes();
        Polymorphism_Circle circle = new Polymorphism_Circle();
        Polymorphism_Square square = new Polymorphism_Square();
        shapes.area();
        circle.area();
        square.area();
    }
}
