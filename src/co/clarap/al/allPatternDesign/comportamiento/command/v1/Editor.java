package co.clarap.al.allPatternDesign.comportamiento.command.v1;

/*
 * Clase "Receiver"
 */
public class Editor {
    
    private String clipboard;
    private String selectedText;
    private String text;

    public String getClipboard() {
        return clipboard;
    }
    public void setClipboard(String clipboard) {
        this.clipboard = clipboard;
    }
    public String getSelectedText() {
        return selectedText;
    }
    public void setSelectedText(String selectedText) {
        this.selectedText = selectedText;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    
}
