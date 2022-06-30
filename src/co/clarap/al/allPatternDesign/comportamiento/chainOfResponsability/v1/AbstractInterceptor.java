package co.clarap.al.allPatternDesign.comportamiento.chainOfResponsability.v1;

/*
 * Clase base de datos de todos los interceptores:
 * Implementa la mayoría de los métodos excepto 'handleRequest'
 * El método 'intercept' ejecuta la cadena
 */
public abstract class AbstractInterceptor implements Interceptor{

    private Interceptor next;

    @Override
    public void intercept(Request request) {
        handleRequest(request);
        if (getNext() != null){
            getNext().intercept(request);
        }
        
    }    

    @Override
    public Interceptor getNext() {
        return next;
    }



    @Override
    public void setNext(Interceptor interceptor) {
        next = interceptor;
    }
    
    
}
