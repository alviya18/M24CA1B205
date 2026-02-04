// Create class Zoo with name and region (String array; sample data eg. Area-1, Area-2 etc.). 
// Create an inner class Enclosure with name (String; sample data eg. Grassland, Fly Zone, Agatic etc.), 
// type (String; 3 sample data Outdoor, Indoor etc.) 
// and animals (String array with the list of animals found in the given enclosure).
// Create a static nested class Contact with address and phoneno. 
// Display details of Zoo including its contact info and detailed information of different Enclosures.
import java.util.Arrays;
public class Zoo {
    String name;
    String[] regions;

    class Enclosure {
        String name;
        String type;
        String[] animals;

        Enclosure(String name, String type, String[] animals) {
            this.name = name;
            this.type = type;
            this.animals = animals;
        }

        void display() {
            System.out.println("Enclosure Name: " + name);
            System.out.println("Type: " + type);
            System.out.println("Animals: " + Arrays.toString(animals));
        }
    }

    static class Contact {
        String address;
        String phoneNo;

        Contact(String address, String phoneNo) {
            this.address = address;
            this.phoneNo = phoneNo;
        }

        void display() {
            System.out.println("Address: " + address);
            System.out.println("Phone No: " + phoneNo);
        }
    }

    public Zoo(String name, String[] regions) {
        this.name = name;
        this.regions = regions;
    }

    void display() {
        System.out.println("Zoo Name: " + name);
        System.out.println("Regions: " + Arrays.toString(regions));
    }
    

   public static void main(String[] args) {
        String[] regions = {"Area-1", "Area-2", "Area-3"};
        Zoo zoo = new Zoo("National Zoo", regions);
        Zoo.Contact contact = new Zoo.Contact("Kosindra,Bengal","9876543210");
        String[] animals1 = {"Lion", "Tiger", "Leopard"};
        String[] animals2 = {"Parrot", "Eagle", "Owl"};
        Zoo.Enclosure enclosure1 = zoo.new Enclosure("Grassland", "Outdoor", animals1);
        Zoo.Enclosure enclosure2 = zoo.new Enclosure("Fly Zone", "Indoor", animals2);
        zoo.display();
        System.out.println("---- Contact ----");
        contact.display();
        System.out.println("---- Enclosures----");
        enclosure1.display();
        System.out.println();
        enclosure2.display();
}
}