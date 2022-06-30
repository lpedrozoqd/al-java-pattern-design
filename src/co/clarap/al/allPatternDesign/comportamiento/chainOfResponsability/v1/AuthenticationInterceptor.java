package co.clarap.al.allPatternDesign.comportamiento.chainOfResponsability.v1;

import java.util.Arrays;
import java.util.List;

import javax.management.RuntimeErrorException;

public class AuthenticationInterceptor extends AbstractInterceptor {

    private final List<String> validTokens = Arrays.asList("abc","123");

    @Override
    public void handleRequest(Request request) {
        String accessToken = request.getHeaders().get("Access-token");

        if (!validTokens.contains(accessToken)){
            throw new RuntimeErrorException(null, "Invalid access token");
        }
        System.out.println("Request authenticated!");
    }
    
}
