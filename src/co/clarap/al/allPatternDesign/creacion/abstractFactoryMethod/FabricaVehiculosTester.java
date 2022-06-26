package co.clarap.al.allPatternDesign.creacion.abstractFactoryMethod;

public class FabricaVehiculosTester {
    public static void main(String[] args) {
        FabricaVehiculosGasolina fabricaVehiculosGasolina = 
            new FabricaVehiculosGasolina();
        Automovil autoGasolina = fabricaVehiculosGasolina.createAutomovile("Ertiga","red", 103, 7);         
        autoGasolina.mostrarCaracteristicas();
        
    }
}
