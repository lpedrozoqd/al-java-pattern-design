package co.clarap.al.allPatternDesign.creacion.prototype;

import java.util.HashMap;

public class FactoriaPrototipo {
    private HashMap mapaObjetos;
    private String nombrePorDefecto;

    public FactoriaPrototipo(){
        mapaObjetos = new HashMap();
        //Se incluyen en el mapa todos los productos prototipo
        mapaObjetos.put("producto_1", new UnProducto(1));
    }

    public Object create(String nombre){
        nombrePorDefecto = nombre;
        Producto objeto = (Producto)mapaObjetos.get(nombre);
        return objeto != null ? objeto.clone() : null;
    }
}
