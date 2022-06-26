package co.clarap.al.allPatternDesign.creacion.builder;

public class PicantePizzaBuilder  extends PizzaBuilder{
   
    
    public PicantePizzaBuilder() {
        super.pizza = new Pizza();
    }

    @Override
    public void buildMasa() {
        pizza.setMasa("cocido");
    }

    @Override
    public void buildRelleno() {
        pizza.setRelleno("pimienta+salchichón");
        
    }

    @Override
    public void buildSalsa() {
        pizza.setSalsa("picante");
    }
}
