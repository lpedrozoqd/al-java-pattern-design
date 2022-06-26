package co.clarap.al.allPatternDesign.creacion.abstractFactoryMethod.v2;

public class WindowsFactory implements IGUIFactory{

    @Override
    public IButton createButon() {
        return new WindowsButton();
    }

    @Override
    public IPanel createPanel() {
        return new WindowsPanel();
    }
    
}
