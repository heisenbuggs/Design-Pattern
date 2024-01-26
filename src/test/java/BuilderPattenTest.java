import BuilderPattern.Computer;

public class BuilderPattenTest {
    public static void main(String[] args) {
        // Using builder to get the object in a single line of code and
        // without any inconsistent state or arguments management issues
        Computer computer = new Computer.
                ComputerBuilder("500 GB", "2 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();

        System.out.println("Computer is " + computer.toString());
    }
}
