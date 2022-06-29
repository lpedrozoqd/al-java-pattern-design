package co.clarap.al.allPatternDesign.estructural.proyx.v1;

/*
 * Service interface: 
 * El proxy debe implementar esta interfaz para enmascarar
 * la clase real.
 */
public interface Internet {
    void connectTo(String serverhost) throws Exception;
}
