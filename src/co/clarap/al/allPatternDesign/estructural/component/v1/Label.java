package co.clarap.al.allPatternDesign.estructural.component.v1;

public class Label extends ComponentAbstract{
    private String name;

    public Label(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println(name);
        super.draw();
    }

    

}
