package co.clarap.al.allPatternDesign.creacion.factoryMethod.v1;

public class ConcreteProduct implements Product{

    @Override
    public void operation() {
        System.out.println("Una operación de este producto");
    }
    
}
