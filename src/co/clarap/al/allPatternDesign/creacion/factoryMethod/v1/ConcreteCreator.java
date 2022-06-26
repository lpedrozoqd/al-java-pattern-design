package co.clarap.al.allPatternDesign.creacion.factoryMethod.v1;

public class ConcreteCreator extends Creator {

    @Override
    public Product factoryMethod() {
        
        return new ConcreteProduct();
    }
    
}
