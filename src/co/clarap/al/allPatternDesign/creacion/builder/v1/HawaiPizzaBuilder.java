package co.clarap.al.allPatternDesign.creacion.builder.v1;

//Concrete builder
public class HawaiPizzaBuilder extends PizzaBuilder{

    

    public HawaiPizzaBuilder() {
        super.pizza = new Pizza();
    }

    @Override
    public void buildMasa() {
        pizza.setMasa("suave");
    }

    @Override
    public void buildRelleno() {
        pizza.setRelleno("Chorizo+alcachofas");
        
    }

    @Override
    public void buildSalsa() {
        pizza.setSalsa("dulce");
    }
    
}
