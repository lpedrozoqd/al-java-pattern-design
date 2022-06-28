package co.clarap.al.allPatternDesign.estructural.component.v1;

public class ComponentTester {
    public static void main(String[] args) {
        Window window = new Window("Main Window");
        Panel firstPanel = new Panel("First panel");
        firstPanel.add(new Label("Label in first panel"));
        window.add(firstPanel);

        Panel secondPanel = new Panel("Second panel");
        secondPanel.add(new Label("Label en second panel"));
        window.add(secondPanel);

        window.draw();

    }
}
