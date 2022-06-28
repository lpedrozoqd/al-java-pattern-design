package co.clarap.al.allPatternDesign.estructural.decorator.v1;


/*
 * Clase base decoradora que se usará como padre de otras decoradoras.
 * Será un wrapper del componente original 
 */


public class DataSourceDecorator implements DataSourceInterface {

    private DataSourceInterface source;

    public DataSourceDecorator(DataSourceInterface source) {
        this.source = source;
    }

    @Override
    public void writeData(String data) {
       source.writeData(data);
        
    }

    @Override
    public String readData() {
        return source.readData();
    }
    
}
