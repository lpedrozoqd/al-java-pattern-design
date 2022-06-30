package co.clarap.al.allPatternDesign.comportamiento.command.v1;

public class CommandTester {
    public static void main(String[] args) {
        IDE ide = new IDE();
        ide.getEditor().setText("Hola mundo!");
        ide.getEditor().setSelectedText("mundo");
        
        ide.clickOnCopyButton();
        ide.shortcutPasteButton();
        System.out.println(ide.getEditor().getText());

        ide.clickUndo();
        System.out.println(ide.getEditor().getText());        
    }
}
