package co.clarap.al.allPatternDesign.creacion.prototype;

//Los 'productos' deben implementar dicha interfaz 'Cloneable'
public interface Producto extends Cloneable{
    Object clone();
}
