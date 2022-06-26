package co.clarap.al.allPatternDesign.creacion.abstractFactoryMethod;

public class FabricaVehiculosElectricos implements FabricaVehiculo {

    @Override
    public Automovil createAutomovile(String model, String color, int potencia, double espacio) {
        return new AutomovilElectrico(model, color, potencia, espacio);
    }

    @Override
    public Scooter createScooter(String modelo, String color, int potencia) {
        return new ScooterElectrico(modelo, color, potencia);
    }
    
}
