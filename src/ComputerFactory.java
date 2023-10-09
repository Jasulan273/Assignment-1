// Factory class for creating Computer objects
public class ComputerFactory {

    // Method to create and return a Computer object based on the provided type and specifications
    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if ("PC".equalsIgnoreCase(type)) {
            // If the type is "PC", create and return a PC object
            return new PC(ram, hdd, cpu);
        } else if ("Server".equalsIgnoreCase(type)) {
            // If the type is "Server", create and return a Server object
            return new Server(ram, hdd, cpu);
        }

        // If the type is neither "PC" nor "Server", return null
        return null;
    }
}
