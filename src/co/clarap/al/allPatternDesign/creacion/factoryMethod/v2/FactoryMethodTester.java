package co.clarap.al.allPatternDesign.creacion.factoryMethod.v2;

public class FactoryMethodTester {
    public static void main(String[] args) {
        IPayment payment = PaymentFactory.createPayment(EPaymentType.CASH);
        payment.doPayment(4000.34);
    }
}
