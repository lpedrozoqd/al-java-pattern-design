package co.clarap.al.allPatternDesign.estructural.component.v1;

public class Panel extends ComponentAbstract{
    private String name;

    public Panel(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println(name);
        super.draw();
    }

    
    
}
