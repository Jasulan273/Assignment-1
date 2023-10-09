// Class representing a Server, extends the abstract class Computer
public class Server extends Computer {
    private String ram; // RAM
    private String hdd; // HDD
    private String cpu; // CPU

    // Constructor to initialize Server specifications
    public Server(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    // Implementation of abstract method to get RAM
    @Override
    public String getRAM() {
        return this.ram;
    }

    // Implementation of abstract method to get HDD
    @Override
    public String getHDD() {
        return this.hdd;
    }

    // Implementation of abstract method to get CPU
    @Override
    public String getCPU() {
        return this.cpu;
    }
}
