package co.clarap.al.allPatternDesign.estructural.facade.v1;

import java.util.HashMap;
import java.util.Map;

/*
 * Facade: proporciona acceso a la funcionalidad particular del subsistema
 */
public class DriverManager {
    private static Map<String,JDBCDriverInterface> driverMap = new HashMap<>();

    private DriverManager(){

    }

    public static void registerDriver(JDBCDriverInterface driver){
        driverMap.put(driver.getDBVendor(), driver);
    }

    public static ConnectionInterface getConnection(String database){
        if (driverMap.containsKey(database)){
            return driverMap.get(database).getConnection();
        }
        throw new IllegalArgumentException("No driver found for database: " + database);

    }
    
}
