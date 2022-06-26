package co.clarap.al.allPatternDesign.creacion.singleton;

public class SingletonV2 {
    public static SingletonV2 instance = null;
    
    //Constructor privado suprimido
    private SingletonV2(){}

    //Creador sincranizado para protegerse de posibles de problemas muti-hilos
    private synchronized static void createInstance(){
        if (instance == null){
            instance = new SingletonV2();
        }
    }

    public static SingletonV2 getinstance(){
        if (instance == null) createInstance();
        return instance;

    }

}
