package co.clarap.al.allPatternDesign.estructural.bridge.v1;

public class WarnLogger extends LoggerAbstract{

    @Override
    public void log(String message) {
        loggerOutput.output(message);
    }

    public WarnLogger(LoggerOutputInterface loggerOutput) {
        super(loggerOutput);
    }

    

}
