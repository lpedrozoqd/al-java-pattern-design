package co.clarap.al.reflection;

import java.util.ArrayList;
import java.util.List;

public class Principal {
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

    }
}
