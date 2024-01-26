package FactoryPattern;

public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if ("Laptop".equalsIgnoreCase(type)) {
            return new Laptop(ram, hdd, cpu);
        }
        else if ("Server".equalsIgnoreCase(type)) {
            return new Server(ram, hdd, cpu);
        }

        return null;
    }
}
