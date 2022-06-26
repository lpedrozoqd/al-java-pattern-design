package co.clarap.al.allPatternDesign.creacion.abstractFactoryMethod.v1;

public class AutomovilElectrico extends Automovil{
    StringBuffer salida = new StringBuffer();


    
    public AutomovilElectrico(String model, String color, int potencia, double espacio) {
        super(model, color, potencia, espacio);
    }



    @Override
    public void mostrarCaracteristicas() {
        salida.append("Automovil eléctrico modelo");
        salida.append(model);
        salida.append("de color");
        salida.append(color);
        salida.append("de potencia");
        salida.append(potencia);
        salida.append("de espacio");
        salida.append(espacio);
        
    }
    
}
