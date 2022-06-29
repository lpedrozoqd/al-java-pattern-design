package co.clarap.al.allPatternDesign.estructural.flyweight.v1;

import java.awt.Color;

public class FlyWeightTester {
    public static void main(String[] args) {
        TreeType type = TreeTypeFactory.getTreeType("Autum Oak", Color.yellow);
        Tree tree1 = new Tree(10,10,type);
        Tree tree2 = new Tree(10,10,type);
        tree1.draw();
        tree2.draw();

    }
}
