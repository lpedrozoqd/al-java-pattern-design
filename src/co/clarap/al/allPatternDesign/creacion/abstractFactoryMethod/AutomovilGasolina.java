package co.clarap.al.allPatternDesign.creacion.abstractFactoryMethod;

public class AutomovilGasolina  extends Automovil{
    StringBuffer salida = new StringBuffer();

    public AutomovilGasolina(String model, String color, int potencia, double espacio) {
        super(model, color, potencia, espacio);
    }

    @Override
    public void mostrarCaracteristicas() {
        salida.append("Automovil gasolina modelo");
        salida.append(model);
        salida.append("de color");
        salida.append(color);
        salida.append("de potencia");
        salida.append(potencia);
        salida.append("de espacio");
        salida.append(espacio);
        
    }
    
}
