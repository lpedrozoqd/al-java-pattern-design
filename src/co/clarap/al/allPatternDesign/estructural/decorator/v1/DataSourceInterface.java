package co.clarap.al.allPatternDesign.estructural.decorator.v1;

/*
 * Interfaz principal
 */
public interface DataSourceInterface {
    public void writeData(String data);
    public String readData();
}
