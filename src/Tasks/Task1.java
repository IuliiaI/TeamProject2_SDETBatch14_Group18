package Tasks;
public class Task1 {
       /*    Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
       Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.  */

    public static void main(String[] args) {
        Shape[] shapes={new Circle(5),new Square(6)};
        for(Shape s:shapes){
            s.calculateArea();
            s.calculatePerimeter();
        }
    }
}
class Circle implements Shape{
    double radius;
    Circle(double radius){
    this.radius=radius;
    }
    @Override
    public void calculateArea() {
        System.out.println("The area of circle is "+3.14*radius*radius);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The perimeter of circle is "+2*3.14*radius);
    }
}
class Square implements Shape{
    double side;
    Square(double side){
        this.side=side;
    }
    @Override
    public void calculateArea() {
        System.out.println("The area of square is "+side*side);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The perimeter of square is "+4*side);
    }
}