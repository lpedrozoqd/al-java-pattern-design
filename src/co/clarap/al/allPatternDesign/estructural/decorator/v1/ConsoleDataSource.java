package co.clarap.al.allPatternDesign.estructural.decorator.v1;

import java.util.Scanner;

/*
 * Ejemplo de componente concreto
 */

public class ConsoleDataSource implements DataSourceInterface{

    @Override
    public void writeData(String data) {
        System.out.println(data);
    }

    @Override
    public String readData() {
        return new Scanner(System.in).nextLine();
    }
    
}
