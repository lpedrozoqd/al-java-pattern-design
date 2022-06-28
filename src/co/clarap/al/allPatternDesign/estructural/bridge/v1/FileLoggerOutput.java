package co.clarap.al.allPatternDesign.estructural.bridge.v1;

public class FileLoggerOutput implements LoggerOutputInterface {

    private String path;

    public FileLoggerOutput(String path) {
        this.path = path;
    }


    @Override
    public void output(String message) {
        System.out.println("File: " + message);
        
    }
    
}
