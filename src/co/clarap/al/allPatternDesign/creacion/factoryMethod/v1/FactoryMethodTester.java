package co.clarap.al.allPatternDesign.creacion.factoryMethod.v1;

public class FactoryMethodTester {
    public static void main(String[] args) {
        Creator aCreator;
        aCreator = new ConcreteCreator();
        Product producto = aCreator.factoryMethod();
        producto.operation();            
    }

}
