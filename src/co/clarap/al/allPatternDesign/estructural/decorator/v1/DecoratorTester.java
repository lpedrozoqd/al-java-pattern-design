package co.clarap.al.allPatternDesign.estructural.decorator.v1;

import java.io.Console;

public class DecoratorTester {
    public static void main(String[] args) {
        ConsoleDataSource consoleDataSource = new ConsoleDataSource();
        String data = consoleDataSource.readData();
        consoleDataSource.writeData(data);

        EncryptionDecorator enc = new EncryptionDecorator(consoleDataSource);
        enc.writeData(data);
    }
}
