//Create a class Rectangle(length,width).
//Define interfaces Measurable with a method declaratioon to find volume of objects
//and Printable with a declaration to display particulars of the object.
//Create a class Cuboid(height) that inherits from Rectangle and implement interface

import java.util.Scanner;

public class Pgm12 {
    static class Rectangle{
        int length;
        int width;
        Rectangle(int l,int b){
            length=l;
            width=b;
        }
    }

    interface Measurable{
        int volume();
    }

    interface Printable{
        void display();
    }

    static class Cuboid extends Rectangle implements Measurable, Printable{
        int height;
        Cuboid(int l,int b,int h){
            super(l, b);
            height=h;
        }
        public int volume(){
            return length*width*height;
        }
        public void display(){
            System.out.println("\nCUBOID\n---------");
            System.out.println("Length   : "+length);
            System.out.println("Width    : "+width);
            System.out.println("Height   :"+height);
            System.out.println("Volume   : "+volume());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("length? : ");
        int l = sc.nextInt();
        System.out.print("width? : ");
        int w = sc.nextInt();
        System.out.print("height? : ");
        int h = sc.nextInt();
        Cuboid c = new Cuboid(l, w, h);
        c.display();
    }

}
