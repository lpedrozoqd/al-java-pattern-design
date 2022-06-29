package co.clarap.al.allPatternDesign.estructural.flyweight.v1;

/*
 * Contiene la parte intrínsica
 */

import java.awt.*;

public class TreeType {
    private String name;
    private Color color;

    public TreeType(String name, Color color){
        this.name = name;
        this.color = color; 
    }

    public void draw(int x, int y){
        System.out.println("TreeType => name: " + name + " color: " + color);
    }

}
