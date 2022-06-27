package co.clarap.al.allPatternDesign.creacion.singleton.v3;

public class SingletonTester {
    public static void main(String[] args) {
        Settings settings = Settings.getInstance();
        settings.set("db.name", "test");
        System.out.println("Settings.getInstance().get('db.name') : " + settings.getInstance().get("db.name"));
    }
}
