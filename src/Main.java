// Main class to demonstrate the usage of ComputerFactory
public class Main {
    public static void main(String[] args) {
        // Create a PC object using ComputerFactory with specified specifications
        Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.4 GHz");

        // Create a Server object using ComputerFactory with specified specifications
        Computer server = ComputerFactory.getComputer("server", "16 GB", "1 TB", "2.9 GHz");

        // Print the configuration details of the created PC and Server objects
        System.out.println("Factory PC Config::" + pc);
        System.out.println("Factory Server Config::" + server);
    }
}
