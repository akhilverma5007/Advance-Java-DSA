public class Polymorphism_Circle extends Polymorphism_Shapes {
    @Override //this is called Anotation
    //This will run when obj of Circle is created
    //Hence it is overriding the parent method
    void area(){
        System.out.println("You're in Circle. ");
    }
}
