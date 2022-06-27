package co.clarap.al.allPatternDesign.estructural.adapter.v2;

public class Celsius implements IMetricTemperatureSystem {
    private double temperature;

    public Celsius(){}

    public Celsius(double temperature){
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
        return "Celsius [temperature=" + temperature + "]";
    }

    
    
}
