package co.clarap.al.allPatternDesign.estructural.adapter;

public class AdapterTester {
    public static void main(String[] args) {
        Guitar eGuitar = new ElectricGuitar();
        System.out.println("==>ElectricGuitar: ");
        eGuitar.onGuitar();
        eGuitar.offGuitar();
        System.out.println("");
        System.out.println("==>ElectricAcousticGuitar: ");
        Guitar eaGuitar = new ElectricAcousticGuitar();
        eaGuitar.onGuitar();
        eaGuitar.offGuitar();

    }
}
