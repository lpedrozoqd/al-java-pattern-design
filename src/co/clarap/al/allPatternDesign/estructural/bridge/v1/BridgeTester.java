package co.clarap.al.allPatternDesign.estructural.bridge.v1;

public class BridgeTester {
    public static void main(String[] args) {
        InfoLogger infoLogger = new InfoLogger(new TerminalLoggerOutput());
        infoLogger.log("message"); //Salida: info message
        ErrorLogger errorLogger = new ErrorLogger(new FileLoggerOutput("error.log"));
    }
}
