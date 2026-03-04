package GeoPackage.shape3D;
import GeoPackage.CalcArea;
import GeoPackage.CalVolume;

public class Sphere implements CalcArea, CalVolume {
    double r;

    public Sphere(double r) {
        this.r = r;
    }

    public double area() {
        return 4 * Math.PI * r * r;
    }

    public double volume() {
        return (4.0/3) * Math.PI * r * r * r;
    }
}