package co.clarap.al.allPatternDesign.creacion.singleton.v3;

import java.util.HashMap;
import java.util.Map;

/*
 * 1- Es una clase final debido a que no se puede heredar.
 * 2- Utiliza métodos sincronizados para traajar con hilos.
 * 3- El consutructor se declara como privado para que sólo pedea ser
 * instanciado internamente.
 */

public final class Settings {
    private static Settings instance;
    private final Map<String,String> settingsMap;

    private Settings() {
        this.settingsMap = new HashMap<>();
    }

    public synchronized static Settings getInstance(){
        if (instance == null){
            instance = new Settings();
        }
        return instance;
    }

    public synchronized void set(String key, String value){
        settingsMap.put(key, value);
    }

    public synchronized void remove(String key){
        settingsMap.remove(key);
    }

    public synchronized String get(String key){
        return settingsMap.get(key);
    }

    
}
