package co.clarap.al.allPatternDesign.creacion.builder;

//Un cliente pidiendo una pizza
public class BuilderTester {
    public static void main(String[] args) {
        Cocina cocina = new Cocina();
        PizzaBuilder hawaiPizzaBuilder = new HawaiPizzaBuilder();
        PizzaBuilder picantePizzaBuilder = new PicantePizzaBuilder();
        cocina.setPizzaBuilder(hawaiPizzaBuilder);
        cocina.construirPizza();
        Pizza pizza = cocina.getPizza();
    }
}
