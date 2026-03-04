package GeoPackage.shape2D;
import GeoPackage.CalcArea;

public class Circle implements CalcArea {
    double radius;

    public Circle(double r) {
        radius = r;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}