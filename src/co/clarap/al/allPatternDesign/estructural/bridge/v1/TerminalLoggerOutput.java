package co.clarap.al.allPatternDesign.estructural.bridge.v1;

public class TerminalLoggerOutput implements LoggerOutputInterface {

    @Override
    public void output(String message) {
        System.out.println(message);
    }
    
}
