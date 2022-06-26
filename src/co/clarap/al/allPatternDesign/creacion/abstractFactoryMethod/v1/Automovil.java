package co.clarap.al.allPatternDesign.creacion.abstractFactoryMethod.v1;

public abstract class Automovil {
    protected String model;
    protected String color;
    protected int potencia;
    protected double espacio;

    public Automovil(String model, String color, int potencia, double espacio) {
        this.model = model;
        this.color = color;
        this.potencia = potencia;
        this.espacio = espacio;
    }

    public abstract void mostrarCaracteristicas();
    
}
