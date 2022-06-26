package co.clarap.al.allPatternDesign.creacion.abstractFactoryMethod;

public class ScooterGasolina extends Scooter{

    StringBuffer salida = new StringBuffer();


    public ScooterGasolina(String modelo, String color, int potencia) {
        super(modelo, color, potencia);
    }

    @Override
    public void mostrarCarateristicas() {
        salida.append("Scooter  electrico  modelo");
        salida.append(modelo);
        salida.append("de color");
        salida.append(color);
        salida.append("de potencia");
        salida.append(potencia);
        System.out.println(salida);            
    }
    
}
