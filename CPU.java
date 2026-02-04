// Create a class CPU with attribute price. Create an inner class Proccessor(no of cores,manufacturer)
// and a static nested class RAM(memory,manufacturer) inside CPU.
// Create an object of the CPU and print details of its proccessor and RAM
public class CPU {

    int price;

    class proccessor {
        int cores;
        String manufacturer;

        void set() {
            this.cores = 8;
            this.manufacturer = "Intel";
        }

        void display() {
            System.out.println("Proccessor Cores: " + cores);
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    static class RAM {
        int memory;
        String manufacturer;

        void set() {
            this.memory = 16;
            this.manufacturer = "Corsair";
        }

        void display() {
            System.out.println("----------------------");
            System.out.println("Memory: " + memory + " GB");
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    public static void main(String[] args) {

        CPU cpu = new CPU();
        cpu.price = 25000;

        CPU.proccessor proc = cpu.new proccessor();
        proc.set();

        CPU.RAM ram = new CPU.RAM();
        ram.set();

        System.out.println("CPU Price: " + cpu.price);
        proc.display();
        ram.display();
    }
}
