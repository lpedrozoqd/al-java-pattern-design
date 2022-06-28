package co.clarap.al.allPatternDesign.estructural.bridge.v1;
/*
 * Abstracción:
 * contiene el comportamiento core del conjunto de clases.
 * Contiene la referencia al otro conjunto de clases (implementadores)
 */
public abstract class LoggerAbstract
 {
    protected final LoggerOutputInterface loggerOutput;

    public LoggerAbstract(LoggerOutputInterface loggerOutput) {
        this.loggerOutput = loggerOutput;
    }

    public abstract void log(String message);
    
}
