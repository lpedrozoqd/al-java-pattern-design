package co.clarap.al.allPatternDesign.creacion.prototype.v1;

//Un ejemplo básico de 'Producto'
public class UnProducto implements Producto {
    private int atributo;

    public UnProducto(int atributo) {
        this.atributo = atributo;
    }

    @Override
    public String toString() {
        return "UnProducto [atributo=" + atributo + "]";
    }

   public Object clone(){
    return new UnProducto(this.atributo);
   }
}
