package co.clarap.al.allPatternDesign.creacion.singleton.v1;

public class Singleton {
    private static final Singleton instance = new Singleton();

    //El constructor privado no permite que se genere un constructor por
    //defecto.
    //(Con mismo modificador de acceso que la definición de la clase)
    private Singleton(){

    }

    public static Singleton getInstance(){
        return instance;
    }

}
