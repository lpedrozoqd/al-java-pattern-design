package co.clarap.al.allPatternDesign.estructural.component.v1;

import java.util.ArrayList;
import java.util.List;

/*
 * Esta clase puede contener otros componentes
 */

public abstract class ComponentAbstract {

    protected List<ComponentAbstract> components = 
        new ArrayList<>();
    
    public void add(ComponentAbstract component){
        components.add(component);
    }        

    public void remove(ComponentAbstract component){
        components.remove(component);
    }

    public void draw(){
        components.stream()
            .forEach(ComponentAbstract::draw);
    }
}


