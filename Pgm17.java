/*
Design a functional interface Dim, having the method to find area. Create lamda functions to find the area of
a) square 
b) Cube
c) Circle 
d) sphere 
*/


@FunctionalInterface
interface Dim {
    double area(double x);
}

public class Pgm17 {

    public static void main(String[] args) {
        Dim square = (x) -> x * x;
        Dim cube = (x) -> 6 * x * x;
        Dim circle = (x) -> Math.PI * x * x;
        Dim sphere = (x) -> 4 * Math.PI * x * x;

        double value = 5;

        System.out.println("Side/Radius value: " + value);
        System.out.println("Area of Square: " + square.area(value));
        System.out.println("Surface Area of Cube: " + cube.area(value));
        System.out.println("Area of Circle: " + circle.area(value));
        System.out.println("Surface Area of Sphere: " + sphere.area(value));
    }
}
