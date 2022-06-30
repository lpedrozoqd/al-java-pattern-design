package co.clarap.al.allPatternDesign.comportamiento.command.v1;

/*
 * La acción es ahora una clase
 */
public interface Command {
    void execute();
    void undo();
}
