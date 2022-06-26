package co.clarap.al.allPatternDesign.creacion.builder;

//Abstract builder
public abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public abstract void buildMasa();
    public abstract void buildRelleno();
    public abstract void buildSalsa();
    
}
