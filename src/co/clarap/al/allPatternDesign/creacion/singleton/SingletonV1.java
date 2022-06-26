package co.clarap.al.allPatternDesign.creacion.singleton;

public class SingletonV1 {
    private static final SingletonV1 instance = new SingletonV1();

    //El constructor privado no permite que se genere un constructor por
    //defecto.
    //(Con mismo modificador de acceso que la definición de la clase)
    private SingletonV1(){

    }

    public static SingletonV1 getInstance(){
        return instance;
    }

}
