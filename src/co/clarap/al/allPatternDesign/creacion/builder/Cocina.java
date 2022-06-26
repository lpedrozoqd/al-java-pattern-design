package co.clarap.al.allPatternDesign.creacion.builder;

//Director
public class Cocina {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pb){
        pizzaBuilder = pb;
    }

    public Pizza getPizza(){
        return pizzaBuilder.getPizza();
    }

    public void construirPizza(){
        pizzaBuilder.buildMasa();
        pizzaBuilder.buildRelleno();
        pizzaBuilder.buildSalsa();
    }
}
