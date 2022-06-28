package co.clarap.al.allPatternDesign.estructural.decorator.v1;

import java.util.Base64;

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSourceInterface source) {
        super(source);
    }

    @Override
    public String readData() {
        return new String(Base64.getDecoder().decode(super.readData()));
    }

    
    
}
