package co.clarap.al.allPatternDesign.estructural.proyx.v1;

/*
 * Servicio o clase real:
 * Contiene la lógica del negocio.
 */
public class RealInternet implements Internet{

    @Override
    public void connectTo(String serverhost) throws Exception {
        System.out.println("Connecting to: " + serverhost);
    }
    
}
