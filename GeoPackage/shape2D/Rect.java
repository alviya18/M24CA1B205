package GeoPackage.shape2D;
import GeoPackage.CalcArea;

public class Rect implements CalcArea {
    double length, breadth;

    public Rect(double l, double b) {
        length = l;
        breadth = b;
    }

    public double area() {
        return length * breadth;
    }
}