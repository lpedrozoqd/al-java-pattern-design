package co.clarap.al.allPatternDesign.creacion.factoryMethod.v2;

public class Cash implements IPayment{

    @Override
    public void doPayment(double money) {
        System.out.println("Pagando con DINERO: " + money);
    }
}
