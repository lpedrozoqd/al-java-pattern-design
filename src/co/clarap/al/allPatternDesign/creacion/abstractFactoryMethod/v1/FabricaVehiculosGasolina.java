package co.clarap.al.allPatternDesign.creacion.abstractFactoryMethod.v1;

public class FabricaVehiculosGasolina implements FabricaVehiculo {

    @Override
    public Automovil createAutomovile(String model, String color, int potencia, double espacio) {
        return new AutomovilGasolina(model, color, potencia, espacio);
    }

    @Override
    public Scooter createScooter(String modelo, String color, int potencia) {
        return new ScooterGasolina(modelo, color, potencia);
    }
    
}
