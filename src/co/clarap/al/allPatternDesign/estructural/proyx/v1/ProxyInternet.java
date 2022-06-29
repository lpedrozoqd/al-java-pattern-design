package co.clarap.al.allPatternDesign.estructural.proyx.v1;

import java.util.Arrays;
import java.util.List;

/*
 * Clase proxy:
 * Utiliza la misma interfaz que la real. Enmascara la lógica
 * de negocio de otra clase.
 * 
 */
public class ProxyInternet implements Internet{

    private final List<String> bannedSites = Arrays.asList("forbidden.com");
    private final Internet internet = new RealInternet();

    @Override
    public void connectTo(String serverHost) throws Exception {
        if (bannedSites.contains(serverHost.toLowerCase())){
            throw new Exception("Acceso denegado!");
        }
        internet.connectTo(serverHost);
    }
    
}
