//Create a class Vehicle (Model, Company). 
//Create a class Car (No. of doors, Fuel Type) that inherits from Vehicle. 
//Create a class Electric (batteryCapacity) that inherits from Car.
//Include the concepts of Abstract Base class, Dynamic Method Dispatch, 
//Constructor as well as method overriding.
    abstract class Vehicle {
        String model;
        String company;
        public Vehicle(String a,String b){
            model=a;
            company=b;
        }  
        abstract void display(); 
    }
    class Car extends Vehicle {
        int no_of_doors;
        String fuel_type;
        public Car(String a,String b,int c,String d){
            super(a,b);
            no_of_doors=c;
            fuel_type=d;
        }
        void display(){
            System.out.println("Model : " + model);
            System.out.println("Company : " + company);
            System.out.println("Doors : "+no_of_doors);
            System.out.println("Fuel Type : "+fuel_type);
        }
    }
    class Electric extends Car  {
        int battery_capacity; 
        public Electric(String a, String b,int c, String d,int battery_capacity) {
            super(a,b,c,d);
            this.battery_capacity = battery_capacity;
        }
        void display(){
            super.display();
            System.out.println("Battery Capacity : "+battery_capacity+" kwh");
        } 
    }
public class Pgm10 {
    public static void main(String[] args) {
        Vehicle v;
        v=new Car("Maruthi","Suzuki",4,"Petrol");
        v.display();
        System.err.println();
        v=new Electric("Maruthi","Suzuki",4,"Electric",2500);
        v.display();
    }
}