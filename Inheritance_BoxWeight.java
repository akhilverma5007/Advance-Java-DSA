
public class Inheritance_BoxWeight extends Inheritance_Box{
    double weight = 100;
    double common = 2;
        public Inheritance_BoxWeight (){
            this.weight = 2;
            this.common = 2;

        }

        public Inheritance_BoxWeight(double length, double width, double height, double weight){
            super(length,height,width); //calling the parent class constructor
            this.weight = weight;
        }
}
