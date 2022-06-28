package co.clarap.al.allPatternDesign.estructural.bridge.v1;

public class ErrorLogger extends LoggerAbstract{


    
    public ErrorLogger(LoggerOutputInterface loggerOutput) {
        super(loggerOutput);
    }

    @Override
    public void log(String message) {
        loggerOutput.output(message);
       
    }
    
}
