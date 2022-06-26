package co.clarap.al.allPatternDesign.creacion.prototype;

public class FactoriaTester {
    public static void main(String[] args) {
        FactoriaPrototipo factoria = new FactoriaPrototipo();
        Producto producto = (Producto) factoria.create("producto_1");
        System.out.println("Este es el producto creado: " + producto);

    }
}
