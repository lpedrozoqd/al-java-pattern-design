package co.clarap.al.allPatternDesign.estructural.bridge.v1;

public class InfoLogger extends LoggerAbstract{

    public InfoLogger(LoggerOutputInterface loggerOutput) {
        super(loggerOutput);
    }

    @Override
    public void log(String message) {
        loggerOutput.output(message);
    }
    

}
