//Create a class Animal (species - private, age & weight - protected, color). 
// Create class Dog (breed, name, owner) which inherits from Animal.
// Include all types of constructors in the base class and overridden display methods
// Create a class Cat (name, eyeColor, tallength) which inherits from Animal. 
// Include methods that give all details of a Cat.
//Demonstrate the concept of Abstract Base Class and Dynamic Method Dispatch


abstract class Animal {
    private String species;
    protected int age;
    protected double weight;
    String color;

    // Default constructor
    public Animal() {
        this.species = "Unknown";
        this.age = 0;
        this.weight = 0.0;
        this.color = "Unknown";
    }

    // Parameterized constructor
    public Animal(String species, int age, double weight, String color) {
        this.species = species;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    // Copy constructor
    public Animal(Animal other) {
        this.species = other.species;
        this.age = other.age;
        this.weight = other.weight;
        this.color = other.color;
    }

    public String getSpecies() {
        return species;
    }

    abstract void display();
}

// Dog class
class Dog extends Animal {
    String breed;
    String name;
    String owner;

    public Dog(String species, int age, double weight, String color,
               String breed, String name, String owner) {
        super(species, age, weight, color);
        this.breed = breed;
        this.name = name;
        this.owner = owner;
    }

    void display() {
        
        System.out.println("Color   : " + color);
        System.out.println("Breed   : " + breed);
        System.out.println("Name    : " + name);
        System.out.println("Owner   : " + owner);
        System.out.println();
    }
}

// Cat class
class Cat extends Animal {
    String name;
    String eyeColor;
    double tailLength;

    public Cat(String species, int age, double weight, String color,
               String name, String eyeColor, double tailLength) {
        super(species, age, weight, color);
        this.name = name;
        this.eyeColor = eyeColor;
        this.tailLength = tailLength;
    }

    public void display() {

        System.out.println("Color       : " + color);
        System.out.println("Name        : " + name);
        System.out.println("Eye Color   : " + eyeColor);
        System.out.println("Tail Length : " + tailLength);
        System.out.println();
    }
}

// Main class
public class Pgm9{
    void display(Animal animal) {
        System.out.println("Species     : " + animal.getSpecies());
        System.out.println("Age         : " + animal.age);
        System.out.println("Weight      : " + animal.weight);
    }
    public static void main(String[] args) {
        Pgm9 p = new Pgm9();
        Animal a;
        a = new Dog("Mammal", 5, 20.5, "Brown","Labrador", "Buddy", "John");
        p.display(a);
        a.display();
        a = new Cat("Mammal", 3, 5.2, "White","Kitty", "Blue", 25.5);
        p.display(a);
        a.display();
    }
}
