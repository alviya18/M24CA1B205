//Create class Rectangle and Sphere that implements
//Printable, Computable, Drawable and draw shapes.

import javax.swing.*;
import java.awt.*;

public class Pgm13 extends JFrame {
    Rectangle r = new Rectangle(5, 4);
    Sphere s= new Sphere(2.5);
    public Pgm13() {
        setTitle("Drawing Shapes");
        setSize(500, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        r.display();
        s.display();
    }
    public void paint(Graphics g) {
        super.paint(g);
        r.draw(g);
        s.draw(g);
    }
    interface Printable {
        void display();
    }

    interface Computable {
        double area();
        double perimeter();
        double volume();
    }

    interface Drawable {
        void draw(Graphics g);
    }

    static class Rectangle implements Printable, Computable, Drawable {
        double l, w;
        Rectangle(double a, double b) {
            l = a;
            w = b;
        }
        public double area() {
            return l * w;
        }
        public double perimeter() {
            return 2 * (l + w);
        }
        public double volume() {
            return 0;
        }
        public void display() {
            System.out.println("\nRECTANGLE");
            System.out.println("Length    : " + l);
            System.out.println("Width     : " + w);
            System.out.println("Area      : " + area());
            System.out.println("Perimeter : " + perimeter());
        }
        public void draw(Graphics g) {
            g.setColor(Color.BLACK);
            g.drawRect(50, 80, (int) l * 30, (int) w * 30);
        }
    }
    
    static class Sphere implements Printable, Computable, Drawable {
        double r;
        Sphere(double a) {
            r = a;
        }
        public double area() {
            return 4 * Math.PI * r * r;
        }
        public double perimeter() {
            return 0;
        }
        public double volume() {
            return (4.0 / 3.0) * Math.PI * r * r * r;
        }
        public void display() {
            System.out.println("\nSPHERE");
            System.out.println("Radius : " + r);
            System.out.println("Area   : " + area());
            System.out.println("Volume : " + volume());
        }

        public void draw(Graphics g) {
            g.setColor(Color.BLACK);
            g.drawOval(250, 80, (int) r * 40, (int) r * 40);
        } 
    }
    public static void main(String[] args) {
        new Pgm13();
    }   
}
