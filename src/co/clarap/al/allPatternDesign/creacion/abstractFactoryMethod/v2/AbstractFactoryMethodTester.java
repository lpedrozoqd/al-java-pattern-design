package co.clarap.al.allPatternDesign.creacion.abstractFactoryMethod.v2;

public class AbstractFactoryMethodTester {
    public static void main(String[] args) {
        IGUIFactory aGUIFactoryLinux = GUIFactorySelector.getFactory(EOperatingSystem.LINUX);
        IButton buttonLinux = aGUIFactoryLinux.createButon();
        IPanel panelLinux = aGUIFactoryLinux.createPanel();
        System.out.println("==> LINUX");
        buttonLinux.paint();
        panelLinux.paint();

        IGUIFactory aGUIFactoryWindows = GUIFactorySelector.getFactory(EOperatingSystem.WINDOWS);
        IButton buttonWin = aGUIFactoryWindows.createButon();
        IPanel panelWin = aGUIFactoryWindows.createPanel();
        System.out.println("==> WINDOWS");
        buttonWin.paint();
        panelWin.paint();        



    }
}
