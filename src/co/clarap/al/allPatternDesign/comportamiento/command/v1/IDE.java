package co.clarap.al.allPatternDesign.comportamiento.command.v1;

/*
 * Clase "Invoker"
 */
public class IDE {
    private Command copyCommand;
    private Command pasteCommand;
    private Command undoCommand;
    private Editor editor;
    
    public IDE(){
        editor = new Editor();
        copyCommand = new Copy(editor);
        pasteCommand = new Paste(editor);
    }

    public Editor getEditor(){
        return editor;
    }

    /**
     * Los comandos pueden ser invocados desde diferentes eventos, como clic a un botón
     * o un shortcut.
     */

    public void clickOnCopyButton() {
        executeCommand(copyCommand);
    }

    public void clickOnPasteButton() {
        executeCommand(pasteCommand);
    }

    public void shortcutCopyButton() {
        executeCommand(copyCommand);
    }

    public void shortcutPasteButton() {
        executeCommand(pasteCommand);
    }



     void executeCommand(Command command){
        command.execute();
        undoCommand.undo();
     }

     /*
      * En caso de necesitar el estado anterior.
      * También se puede incluir un patrón memento.
      */
     public void clickUndo(){
        undoCommand.undo();
     }




}
