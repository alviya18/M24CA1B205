//Create an interface with functions area(),perimeter()
//Create two class circle,rectangle which implements the above interface.
//Create a menu driven pgm to find area and perimeter of various objects.

import java.util.Scanner;

public class Pgm14 {
    interface Computable {    
        double area();
        double perimeter();
    }
    static class Circle implements Computable {
        double r;
        Circle(){
            r=3.5;
        }
        public double area(){
            return Math.PI*r*r;
        }
        public double perimeter(){
            return 2*Math.PI*r;
        }
    }
    static class Rectangle implements Computable{
        double l;
        double w;
        Rectangle(){
            l=12;
            w=4;
        }
        @Override
        public double perimeter() {
            return 2*(l+w);
        }
        @Override
        public double area() {
            return l*w;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Rectangle r=new Rectangle();
        Circle c= new Circle();
        while (true) {
            System.out.println("\nMENU\n>>>>>>>\nSHAPE\n1.Circle\n2.Rectangle");
            int shape=s.nextInt();
            System.out.println("1.Area\n2.Perimeter");
            int ch=s.nextInt();
            switch (shape) {
                case 1:
                    if (ch == 1)
                        System.out.println("Area : " + c.area());
                    else if (ch == 2)
                        System.out.println("Perimeter : " + c.perimeter());
                    else
                        System.out.println("Invalid Choice");
                    break;
                case 2:
                    if (ch == 1)
                        System.out.println("Area : " + c.area());
                    else if (ch == 2)
                        System.out.println("Perimeter : " + c.perimeter());
                    else
                        System.out.println("Invalid Choice");
                default:
                    break;
            }
        }
    }
}
