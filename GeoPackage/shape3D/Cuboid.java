package GeoPackage.shape3D;
import GeoPackage.CalcArea;
import GeoPackage.CalVolume;

public class Cuboid implements CalcArea, CalVolume {
    double l, b, h;

    public Cuboid(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    public double area() {
        return 2 * (l*b + b*h + l*h);
    }

    public double volume() {
        return l * b * h;
    }
}