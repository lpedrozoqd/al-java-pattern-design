package co.clarap.al.allPatternDesign.comportamiento.chainOfResponsability.v1;

public interface Interceptor {
   void handleRequest(Request request);
   void intercept(Request request);
   Interceptor getNext();
   void setNext(Interceptor interceptor); 
}
