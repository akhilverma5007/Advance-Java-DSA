//Here This class is parent of Inheritance_BoxWeight Class , so this class cant access the properties of "Inheritance_BoxWeight" its child class
public class Inheritance_Box{
   
    double length = 100;
    double width = 70;
    double height = 170;
    double common = 24;

    Inheritance_Box(){
        this.length = -1;
        this.width = -1;
        this.height = -1;
        // this.weight = 2; //this will show error because, you cant access child properties
    }       

    Inheritance_Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    Inheritance_Box(Inheritance_Box old){
        this.length = old.length;
        this.width = old.width;
        this.height = old.height;
    }
}
