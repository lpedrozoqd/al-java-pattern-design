package co.clarap.al.allPatternDesign.estructural.adapter.v2;

public class Fahrenheit implements IImperialTemperatureSystem{
    private double temperature;

   
    public Fahrenheit() {}

    public Fahrenheit(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public double getTemperature() {
        return this.temperature;
    }

    @Override
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Fahrenheit [temperature=" + temperature + "]";
    }

    
    
}
