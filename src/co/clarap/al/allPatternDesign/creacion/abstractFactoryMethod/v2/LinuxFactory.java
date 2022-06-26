package co.clarap.al.allPatternDesign.creacion.abstractFactoryMethod.v2;

public class LinuxFactory implements IGUIFactory {

    @Override
    public IButton createButon() {
        return new LinuxButton();
    }

    @Override
    public IPanel createPanel() {
        return new LinuxPanel();
    }
    
}
