package co.clarap.al.allPatternDesign.creacion.abstractFactoryMethod.v2;

public class GUIFactorySelector {
    public static IGUIFactory getFactory(EOperatingSystem os){
        switch (os) {
            case WINDOWS:
                return  new WindowsFactory();
            case LINUX:
                return new LinuxFactory();
            default:
                return null;
        }
    }
}
