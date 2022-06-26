package co.clarap.al.allPatternDesign.estructural.adapter.v1;

//Implementación directa: listo el wrapped/adaptado
public class ElectricGuitar implements Guitar{

    @Override
    public void onGuitar() {
        System.out.println("Playing guitar!");
    }

    @Override
    public void offGuitar() {
        System.out.println("I'm tired to play the guitar!");
    }
    
}
