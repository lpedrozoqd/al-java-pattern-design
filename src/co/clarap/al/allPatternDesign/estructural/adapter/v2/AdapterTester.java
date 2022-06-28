package co.clarap.al.allPatternDesign.estructural.adapter.v2;

import java.util.Arrays;
import java.util.List;

public class AdapterTester {
    public static void main(String[] args) {
        Fahrenheit fahrenheit = new Fahrenheit(98.6);
        List<IMetricTemperatureSystem> tempList = Arrays.asList(
            new Celsius(37),
            new CelsiusAdapter(fahrenheit));

        System.out.println("==>Adapter");
        System.out.println(":: getTemperature: " + tempList);


    }
}
