package co.clarap.al.allPatternDesign.creacion.factoryMethod;

public class ConcreteCreator extends Creator {

    @Override
    public Product factoryMethod() {
        
        return new ConcreteProduct();
    }
    
}
