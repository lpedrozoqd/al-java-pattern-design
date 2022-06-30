package co.clarap.al.allPatternDesign.comportamiento.chainOfResponsability.v1;

import java.util.Map;

public class ChainOfResponsabilityTester {
    public static void main(String[] args) {
        AuthorizationInterceptor autoriz = new AuthorizationInterceptor();
        AuthenticationInterceptor authent = new AuthenticationInterceptor();
        authent.setNext(autoriz);

        Request request = new Request();
        request.setHeaders(Map.of("Access-Token","123"));

        authent.intercept(request);

    }
}
