package co.clarap.al.allPatternDesign.creacion.builder.v2;

import co.clarap.al.allPatternDesign.creacion.builder.v1.Pizza;

/*
 * 2da. opción para el abstract-builder quizá más trasparente para su uso
 * Dentro del 'crear' se llaman los métodos 'build'
 * Es válido siempre y cuando no se necesite alterar
 * el orden del llamado a los "build's"
 */
public abstract class OtroPizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza(){
        return pizza;
    };

    public void crearNuevaPizza(){
        pizza = new Pizza();
        buildMasa();
        buildRelleno();
        buildSalsa();
    }

    public abstract void buildMasa();
    public abstract void buildSalsa();
    public abstract void buildRelleno();



}
