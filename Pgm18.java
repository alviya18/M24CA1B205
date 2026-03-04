import Arithmetic.*;
import GeoPackage.shape2D.*;
import GeoPackage.shape3D.*;

public class Pgm18 {

    public static void main(String[] args) {

        double a = 10, b = 5;

        Add add = new Add();
        Sub sub = new Sub();
        Mul mul = new Mul();
        Div div = new Div();

        System.out.println("Addition: " + add.operate(a, b));
        System.out.println("Subtraction: " + sub.operate(a, b));
        System.out.println("Multiplication: " + mul.operate(a, b));
        System.out.println("Division: " + div.operate(a, b));

        Rect rect = new Rect(5, 3);
        Circle circle = new Circle(4);
        Cuboid cuboid = new Cuboid(4, 3, 2);
        Sphere sphere = new Sphere(3);

        System.out.println("Rectangle Area: " + rect.area());
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Cuboid Surface Area: " + cuboid.area());
        System.out.println("Cuboid Volume: " + cuboid.volume());
        System.out.println("Sphere Surface Area: " + sphere.area());
        System.out.println("Sphere Volume: " + sphere.volume());
    }
}