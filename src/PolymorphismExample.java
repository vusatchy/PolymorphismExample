/**
 * Created by white on 04.01.2017.
 */
interface FigureInterface {
    public void printArea();
    public void printPerimeter();
}

class Rectangle implements FigureInterface{

    private float length;
    private float width;

    public Rectangle(float length,float width){
        this.width=width;
        this.length=length;
    }

    @Override
    public void printArea() {
          System.out.println("Rectangle area: "+length*width);
    }

    @Override
    public void printPerimeter() {
        System.out.println("Rectangle perimeter: "+2*(length+width));
    }
}

class  Circle implements FigureInterface{

    private float radius;

    public Circle(float radius){
        this.radius=radius;
    }

    @Override
    public void printArea() {
        System.out.println("Circles area: "+3.141*radius*radius);
    }

    @Override
    public void printPerimeter() {
        System.out.println("Circles perimeter: "+2*3.141*radius);
    }
}



public class PolymorphismExample {
    public static   void main(String[] arg){
     FigureInterface circle=new Circle(4);
     FigureInterface rectangle = new Rectangle(3,4);
     rectangle.printArea();
     rectangle.printPerimeter();
     circle.printPerimeter();
     circle.printArea();


    }
}
