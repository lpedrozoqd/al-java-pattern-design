package co.clarap.al.allPatternDesign.estructural.adapter.v2;

public class CelsiusAdapeter implements IMetricTemperatureSystem {

    private static final double BASE_SCALE = 32.;
    private static final double FACTOR_TO_FAHRENHEIT = 9. / 5.;
    private static final double FACTOR_TO_CELSIUS = 5. / 9.;    

    @Override
    public double getTemperature() {
      return 0;
    }

    @Override
    public void setTemperature(double temperature) {
         
    }
    
}
