package co.clarap.al.allPatternDesign.creacion.prototype.v2;

import java.awt.*;

/*
 * Clase prototype. Los hijos deben implementar el método clone. Además
 * se cre un constructor que recibe como parámetro otra Shape
 * que servirá de base.
 */
public abstract class Shape {
    private Color color;
    private double x;
    private double y;
    
    public Shape(){}

    public Shape(Shape base){
        color = base.color;
        x = base.x;
        y = base.y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public abstract Shape clone();

}
