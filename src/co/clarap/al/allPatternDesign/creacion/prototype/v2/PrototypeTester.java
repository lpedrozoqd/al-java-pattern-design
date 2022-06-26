package co.clarap.al.allPatternDesign.creacion.prototype.v2;

import java.awt.Color;

public class PrototypeTester {
    public static void main(String[] args) {
        Square s = new Square();
        s.setColor(Color.BLACK);
        s.setWidth(100);
        s.setHeight(50);
        s.setX(20);
        s.setY(20);
        System.out.println("==>Objeto original: " + s);
        Shape s2 = s.clone();
        System.out.println("==>Copia de objeto: " +  s2);
        System.out.println("** propiedades de s2: " + s2.toString());

        
    }
}
