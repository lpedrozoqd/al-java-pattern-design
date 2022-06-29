package co.clarap.al.allPatternDesign.estructural.flyweight.v1;

import java.util.HashMap;
import java.util.Map;
import java.awt.*;

/*
 * El patrón 'flyweight' factory decide si reutilizar las instancias existentes.
 */
public class TreeTypeFactory {
    private static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color){
        TreeType result = treeTypes.get(name);
        if (result == null){
            result = new TreeType(name, color);
            treeTypes.put(name, result);
        }
        return result;
    }

    
}
