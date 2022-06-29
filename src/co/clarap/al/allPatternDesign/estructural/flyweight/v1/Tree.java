package co.clarap.al.allPatternDesign.estructural.flyweight.v1;

/*
 * Clase contextual (context) contiene la parte extrínsica
 */
public class Tree {
    private int x;
    private int y;
    private TreeType type;
    
    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(){
        type.draw(x, y);
    }
}
