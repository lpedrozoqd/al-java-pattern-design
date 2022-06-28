package co.clarap.al.allPatternDesign.estructural.adapter.v2;

public class CelsiusAdapter implements IMetricTemperatureSystem {

    private static final double BASE_SCALE = 32.;
    private static final double FACTOR_TO_FAHRENHEIT = 9. / 5.;
    private static final double FACTOR_TO_CELSIUS = 5. / 9.;    

    private Fahrenheit fahrenheit;

    public CelsiusAdapter(Fahrenheit fahrenheit) {
      this.fahrenheit = fahrenheit;
    }

    @Override
    public double getTemperature() {
      return (fahrenheit.getTemperature() - BASE_SCALE) * FACTOR_TO_CELSIUS;
    }

    @Override
    public void setTemperature(double temperature) {
      fahrenheit.setTemperature(temperature * FACTOR_TO_FAHRENHEIT + BASE_SCALE);         
    }

    @Override
    public String toString() {
      return "CelsiusAdapeter [fahrenheit=" + getTemperature() + "]";
    }
    
    

    
}
