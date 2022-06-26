package co.clarap.al.allPatternDesign.creacion.singleton.v2;

public class Singleton {
    public static Singleton instance = null;
    
    //Constructor privado suprimido
    private Singleton(){}

    //Creador sincranizado para protegerse de posibles de problemas muti-hilos
    private synchronized static void createInstance(){
        if (instance == null){
            instance = new Singleton();
        }
    }

    public static Singleton getinstance(){
        if (instance == null) createInstance();
        return instance;

    }

}
