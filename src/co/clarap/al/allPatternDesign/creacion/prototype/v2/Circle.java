package co.clarap.al.allPatternDesign.creacion.prototype.v2;

public class Circle extends Shape{

    private double radius;
    
    public Circle() {}

    public Circle(Circle base) {
        super(base);
        this.radius = base.radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public Shape clone() {
       return new Circle(this);
    }
    
}
