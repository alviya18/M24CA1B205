//Demonstarte method overloading.
//Create a geometry class with methods to find area of square(int),retangle(int,int),circle(double).
// Demonstrate Method Overloading

class Geometry {
    int area(int side) {
        return side * side;
    }
    int area(int length, int breadth) {
        return length * breadth;
    }
    double area(double radius) {
        return 3.14 * radius * radius;
    }
    public static void main(String[] args) {

        Geometry g = new Geometry();

        System.out.println("Area of Square: " + g.area(4));
        System.out.println("Area of Rectangle: " + g.area(2, 6));
        System.out.println("Area of Circle: " + g.area(3.5));
    }
}

