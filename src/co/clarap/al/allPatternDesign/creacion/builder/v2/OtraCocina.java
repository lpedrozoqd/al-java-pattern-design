package co.clarap.al.allPatternDesign.creacion.builder.v2;

//Director
public class OtraCocina {
    private OtroPizzaBuilder pizzaBuilder;

    public void construirPizza(){
        pizzaBuilder.crearNuevaPizza();
        //Notar que no se necesita llamar a
        //cada 'build'.
    }
}
