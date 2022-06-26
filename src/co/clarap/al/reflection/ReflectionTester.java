package co.clarap.al.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ReflectionTester {
    public static void main(String[] args) {
        List<Ordenador> lista1 = new ArrayList<>();
        System.out.println("==>Reflection");
        lista1.add(new Ordenador("A1", "Ordenador gaming", 4));
        lista1.add(new Ordenador("b1", "Ordenador ofimática", 2));
        for (Ordenador o : lista1){
            System.out.println("::getDescripcion: " + o.getDescripcion());
        }

        List<Lavadora> lista2 = new ArrayList<>();
        System.out.println("");

        lista2.add(new Lavadora("L1", "Samsung", "T2000"));
        lista2.add(new Lavadora("L2", "LG", "AL44"));
        for (Lavadora o : lista2){
            System.out.println("::getDescripcion: " + o.getDescripcion());
        }
        System.out.println("");
        System.out.println("%% Lista Ordenador");
        imprimirListaCualquiera(lista1);
        System.out.println("");
        System.out.println("%% Lista Lavadora");
        imprimirListaCualquiera(lista2);
        
    }

    public static void imprimirListaCualquiera(List<?> lista){
        for(Object c : lista){
            Method[] metodos = c.getClass().getMethods();
            for(Method m: metodos){
                //System.out.println("==>Method.getName: " + m.getName());
                if (m.getName().equals("getId") 
                    || m.getName().equals("getDescription") ){
                    try {
                        String cadena = (String) m.invoke(c, null);
                        System.out.println("::método(getId): " + cadena);
                    } catch (IllegalAccessException  | IllegalArgumentException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
