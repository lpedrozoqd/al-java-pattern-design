package co.clarap.al.allPatternDesign.creacion.abstractFactoryMethod;

public interface FabricaVehiculo {
    Automovil createAutomovile(String model,String color, int  potencia, double espacio);
    Scooter createScooter( String modelo, String color,int potencia);
}
