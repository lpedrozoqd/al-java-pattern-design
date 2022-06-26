package co.clarap.al.allPatternDesign.creacion.factoryMethod.v2;

public class PaymentFactory {
    public static IPayment createPayment(EPaymentType paymentType){
        switch (paymentType) {
            case CASH:
                return new Cash();
            case CREDIT_CARD:                
                return new CreditCard();
            default:
                return null;                
        }
    }

}
