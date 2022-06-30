package co.clarap.al.allPatternDesign.comportamiento.chainOfResponsability.v1;

public class AuthorizationInterceptor extends AbstractInterceptor{

    @Override
    public void handleRequest(Request request) {
        String url = request.getUrl();
        if (url.endsWith("/forbidden")){
            throw new RuntimeException("Acces forbiden");
        }
        System.out.println("Request authorized");
        
    }
    
}
