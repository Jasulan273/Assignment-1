// Abstract class representing a Computer
public abstract class Computer {

    // Method to get computer's RAM, HDD, and CPU
    public abstract String getRAM(); // Get RAM
    public abstract String getHDD(); // Get HDD
    public abstract String getCPU(); // Get CPU

    // Override the toString method to provide a formatted string representation
    @Override
    public String toString() {
        // Return a formatted string
        return "RAM= " + this.getRAM() + ", HDD=" + this.getHDD() + ", CPU=" + this.getCPU();
    }
}
